package transfering;

import lock.MyVolatile;

import java.util.HashMap;
import java.util.Set;

/**
 * 注意传基本数据类型的数组时会改变，因为数组是对象！此时传递的是引用！
 */
public class PassRef {
    public static HashMap<String, String> testMap = new HashMap<>();

    public static void main(String[] args) {
        testMap.put("k1", "v1");
        testMap.put("k2", "v2");
        testMap.put("k3", "v3");
        PassRef passRef = new PassRef();
        passRef.change(testMap);//引用传递，会变
        //输出结果
        Set res = testMap.entrySet();
        for (Object item : res) {
            System.out.println(item);//输出中包含k4=v4
        }
    }

    public void change(HashMap<String, String> arg) {
        arg.put("k4", "v4");
    }
}
