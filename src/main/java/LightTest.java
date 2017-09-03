import java.util.EnumMap;
import java.util.EnumSet;

/**
 * Enum sample
 * 
 * @Author doctorrm
 * @Time 2017-08-31 ����4:00:05
 */
public class LightTest {

	// 1. ����ö������

	public enum Light {

		// ���ù��캯������

		RED(1), GREEN(3), YELLOW(2);

		// ����˽�б���

		private int nCode;

		// ���캯����ö������ֻ��Ϊ˽��

		private Light(int _nCode) {

			this.nCode = _nCode;

		}

		@Override

		public String toString() {

			return String.valueOf(this.nCode);

		}

	}

	/**
	 * 
	 * @param args
	 * 
	 */

	public static void main(String[] args) {

		// 1. ����ö������

		System.out.println(" ��ʾö�����͵ı��� ......");

		testTraversalEnum();

		// 2. ��ʾ EnumMap �����ʹ��

		System.out.println(" ��ʾ EnmuMap �����ʹ�úͱ��� .....");

		testEnumMap();

		// 3. ��ʾ EnmuSet ��ʹ��

		System.out.println(" ��ʾ EnmuSet �����ʹ�úͱ��� .....");

		testEnumSet();

	}

	/**
	 * 
	 * ��ʾö�����͵ı���
	 * 
	 */

	private static void testTraversalEnum() {

		Light[] allLight = Light.values();

		for (Light aLight : allLight) {

			System.out.println(" ��ǰ�� name �� " + aLight.name());

			System.out.println(" ��ǰ�� ordinal �� " + aLight.ordinal());

			System.out.println(" ��ǰ�ƣ� " + aLight);

		}

	}

	/**
	 * 
	 * ��ʾ EnumMap ��ʹ�ã� EnumMap �� HashMap ��ʹ�ò�ֻ࣬���� key Ҫ��ö������
	 * 
	 */

	private static void testEnumMap() {

		// 1. ��ʾ���� EnumMap ���� EnumMap ����Ĺ��캯����Ҫ�������� , Ĭ���� key ���������

		EnumMap<Light, String> currEnumMap = new EnumMap<Light, String>(

				Light.class);

		currEnumMap.put(Light.RED, " ��� ");

		currEnumMap.put(Light.GREEN, " �̵� ");

		currEnumMap.put(Light.YELLOW, " �Ƶ� ");

		// 2. ��������

		for (Light aLight : Light.values()) {

			System.out.println("[key=" + aLight.name() + ",value="

					+ currEnumMap.get(aLight) + "]");

		}

	}

	/**
	 * 
	 * ��ʾ EnumSet ���ʹ�ã� EnumSet ��һ�������࣬��ȡһ�����͵�ö���������� <BR/>
	 * 
	 * ����ʹ�� allOf ����
	 * 
	 */

	private static void testEnumSet() {

		EnumSet<Light> currEnumSet = EnumSet.allOf(Light.class);

		for (Light aLightSetElement : currEnumSet) {

			System.out.println(" ��ǰ EnumSet ������Ϊ�� " + aLightSetElement);

		}

	}

}
