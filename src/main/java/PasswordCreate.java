

import java.util.Random;

/**
 * 
 * @Author doctorrm
 * @Time  2017-08-30 ����2:24:49
 */
public class PasswordCreate {
	
	/**
	 * �������,just invoke this method
	 * @param len ���볤��
	 * @return
	 */
	public static  String createPassWord(int len){	
		PasswordCreate passwordCreate=new PasswordCreate();
		int random = passwordCreate.createRandomInt();
		return passwordCreate.createPassWord(random, len);
	}
	
	public String createPassWord(int random,int len){
		Random rd = new Random(random);
		final int  maxNum = 62;
		StringBuffer sb = new StringBuffer();
		int rdGet;//ȡ�������
		char[] str = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
			    'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
			    'x', 'y', 'z', 'A','B','C','D','E','F','G','H','I','J','K',
			    'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
			    'X', 'Y' ,'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		
		int count=0;
		while(count < len){
			rdGet = Math.abs(rd.nextInt(maxNum));//���ɵ������Ϊ62-1
			if (rdGet >= 0 && rdGet < str.length) {
				sb.append(str[rdGet]);
			    count ++;
			}
		}
		return sb.toString();
	}
	/**
	 * generate a random int within [0,100000)
	 * @return
	 */
	public int createRandomInt(){
		//�õ�0.0��1.0֮������֣�������100,000��
		double temp = Math.random()*100000;
		//������ݵ���100000�������1
		if(temp>=100000){
			temp = 99999;
		}
		int tempint = (int)Math.ceil(temp);
		return tempint;
	}
}
