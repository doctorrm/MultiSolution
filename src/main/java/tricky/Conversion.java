package tricky;
/**
 * ������
 * @Author doctorrm
 * @Time  2017-09-03 ����12:07:43
 */
public class Conversion {
	public static void main(String[] args) {
		/**
		 * ���һ�����Ϊʲô��65535������-1��
		 * 
		 * խ������ ת���� �Ͽ������ʱ������չ��������������ֵ�������з��ŵģ���ô��ִ�з�����չ�����������λΪ1������չΪ1�����Ϊ�㣬����չΪ0����
		 * �������char����ô��������Ҫ��������ʲô���ͣ���ִ������չ��
		 * 
		 * �˽�����Ĺ�������������������⣺��Ϊbyte���з��ŵ����ͣ������ڽ�byte��ֵ-1��������Ϊ��1111
		 * 1111��������charʱ���ᷢ������λ��չ��
		 * �ַ���λΪ1�����ԾͲ�8��1�����Ϊ16��1��Ȼ���char��int������ʱ��������char���������������ͣ����Բ�������չ�����Ƿ�����չ��
		 * ���int��ֵ�ͳ���65535��
		 */
		System.out.println((byte) -1); 				// -1
		System.out.println((char) (byte) -1);		// ?
		System.out.println((int)(byte)-1);			//-1
		System.out.println((int) (char) (byte) -1+"\n");// 2^16-1 = 65535
	
		
		 System.out.println(0x80000001);//-2147483647 ���Ѿ���32λ�����λ�Ƿ���λ
		 System.out.println(0xcafebabe);//-889275714
		 System.out.println(0xffff);     //65535 int��32λ�ģ����λ�Ѿ���0���൱��0X0000ffff
		 System.out.println(0xff+"\n");       //255
	
		 System.out.println(((byte)0x90==0x90));
	
	}
}