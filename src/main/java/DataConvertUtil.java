

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;


/**
 *   Map  <->  JSON  <->  POJO 
 * 	  |					    |
 *    |						|
 * 	  |<------------------->|
 * 
 * MapList <-> JSONs  <-> POJOList
 * 	  |					    |
 *    |						|
 * 	  |<------------------->|
 * Mention:Do not use Ctrl+Shift+F to format this Class,or the comment above will crash. 
 * Map represents a single entry queried from the DB.
 * 
 * @Author doctorrm
 * @Time 2017-08-28 上午10:22:14
 */
public class DataConvertUtil {
	public static ObjectMapper mapper=new ObjectMapper();
	
	/**
	 * Single map to json.
	 * 
	 * @param singleMap
	 * @return
	 * @throws JsonProcessingException 
	 */
	public static String map2Json(Map<String, Object> map) throws JsonProcessingException {
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
		return json;
	}

	public static Map<String, Object> json2Map(String json) throws JsonParseException, JsonMappingException, IOException {		
		Map<String, Object> map=mapper.readValue(json, new TypeReference<Map<String, Object>>() {});
		return map;
	}

	/**
	 * use jackson jar to convert java POJO object to Json.
	 * 
	 * @throws JsonProcessingException
	 */
	public static String pojo2Json(Object pojo) throws JsonProcessingException {
		String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pojo);
		return jsonInString;
	}

	public static Object json2POJO(String json,Object pojo) throws JsonParseException, JsonMappingException, IOException {
		Object object=mapper.readValue(json, pojo.getClass());
		return object;
	}

	/**
	 * use jackson to convert Map<K,V> into java POJO. 
	 * PS:Map<K,V> represents a single entry queried from the DB.
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 * @throws IOException 
	 */
	public static Object map2POJO(Map<String, Object> map,Object pojo) throws JsonParseException, JsonMappingException, IOException{
		String json=map2Json(map);
		Object object=json2POJO(json, pojo);		
		return object;
	}

	public static Map<String, Object> pojo2Map(Object pojo) throws JsonParseException, JsonMappingException, IOException {
		String json=pojo2Json(pojo);
		Map<String, Object> map=json2Map(json);
		return map;
	}
	// ------------------------------List operation--------------------------------------//

	/**
	 * 把查询到的数据转为json字符串的形式
	 * 
	 * @param mapList
	 * @return
	 */
	public static String mapList2JSONs(List<Map<String, Object>> mapList) {
		String jsonStr = "";
		for (int i = 0; i < mapList.size(); i++) {
			Map<String, Object> map = mapList.get(i);
			String row = "";
			for (String key : map.keySet()) {
				row = row + "'" + key + "':'" + map.get(key) + "',";
			}
			row = "{" + row.substring(0, row.length() - 1) + "},";
			jsonStr = jsonStr + row;
		}
		jsonStr = "[" + jsonStr.substring(0, jsonStr.length() - 1) + "]";
		return jsonStr;
	}
	
	public static List<Map<String, Object>> jsons2MapList(String jsons,Object pojo) throws JsonParseException, JsonMappingException, IOException{
		List<Object> pojoList = jsons2POJOs(jsons, pojo);
		List<Map<String, Object>> mapList = pojoList2MapList(pojoList);
		return mapList;
	}
	
	/**
	 * POJOs to JSONs
	 * @param pojoList
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static String pojos2JSONs(List<Object> pojoList) throws JsonParseException, JsonMappingException, IOException{
		List<Map<String, Object>> mapList=pojoList2MapList(pojoList);
		String jsons=mapList2JSONs(mapList);
		return jsons;
	}
	
	public static  List<Object> jsons2POJOs(String jsons,Object pojo) throws JsonParseException, JsonMappingException, IOException{		
		List<Object> pojoList = new ObjectMapper().readValue(jsons,
				TypeFactory.defaultInstance().constructCollectionType(List.class,  
						pojo.getClass()));
		return pojoList;
	}
	
	/**
	 * MapList to POJOList
	 * @param mapList
	 * @param pojo
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static List<Object> mapList2POJOList(List<Map<String, Object>> mapList,Object pojo) throws JsonParseException, JsonMappingException, IOException{
		List<Object> pojoList=new ArrayList<Object>();
		for(Map<String, Object> map:mapList){
			Object object=map2POJO(map, pojo);
			pojoList.add(object);
		}
		return pojoList;
	}
	
	public static List<Map<String, Object>> pojoList2MapList(List<Object> pojoList) throws JsonParseException, JsonMappingException, IOException{
		List<Map<String, Object>> mapList=new ArrayList<Map<String, Object>>();
		for(Object pojo:pojoList){
			Map<String, Object> map=pojo2Map(pojo);
			mapList.add(map);
		}
		return mapList;
	}
	
//end
}
