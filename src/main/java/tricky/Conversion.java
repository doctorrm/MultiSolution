package tricky;
/**
 * 不懂！
 * @Author doctorrm
 * @Time  2017-09-03 下午12:07:43
 */
public class Conversion {
	public static void main(String[] args) {
		/**
		 * 最后一个结果为什么是65535而不是-1？
		 * 
		 * 窄的整型 转换成 较宽的整型时符号扩展规则：如果最初的数值类型是有符号的，那么就执行符号扩展（即如果符号位为1，则扩展为1，如果为零，则扩展为0）；
		 * 如果它是char，那么不管它将要被提升成什么类型，都执行零扩展。
		 * 
		 * 了解上面的规则后，我们再来看看迷题：因为byte是有符号的类型，所以在将byte数值-1（二进制为：1111
		 * 1111）提升到char时，会发生符号位扩展，
		 * 又符号位为1，所以就补8个1，最后为16个1；然后从char到int的提升时，由于是char型提升到其他类型，所以采用零扩展而不是符号扩展，
		 * 结果int数值就成了65535。
		 */
		System.out.println((byte) -1); 				// -1
		System.out.println((char) (byte) -1);		// ?
		System.out.println((int)(byte)-1);			//-1
		System.out.println((int) (char) (byte) -1+"\n");// 2^16-1 = 65535
	
		
		 System.out.println(0x80000001);//-2147483647 ，已经是32位，最高位是符号位
		 System.out.println(0xcafebabe);//-889275714
		 System.out.println(0xffff);     //65535 int是32位的，最高位已经是0，相当于0X0000ffff
		 System.out.println(0xff+"\n");       //255
	
		 System.out.println(((byte)0x90==0x90));
	
	}
}