package callback2;

/**
 * �ϰ�����Ϊ�ϲ�Ӧ����ݳ��ֵģ��²�Ӧ�ã�Ա�����ǲ�֪�� ����Щ������������뱻�²�Ӧ�ã�Ա�������ñ���ʵ�ִ˽ӿڡ�
 * ʵ�ֽӿڵ��඼���Լ�д���ࡣ�ӿ��൱�ڿ�������API���������Ƕ����ܷ�������չ��ʹ�ÿ���ܵ����Լ����ࡣ
 * 
 * @author Doctorwho
 */
public class Boss implements CallBackInterface {
	@Override
	public void execute() {
		System.out.println("Boss ad me has got it:" + System.currentTimeMillis());
	}
}
