package io;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class IO {
	public static void  main(String[] args) throws IOException {
		//ʹ��apache��commons-io.jar������ֻ��ɾ���ļ��ж������ļ�����
		FileUtils.deleteDirectory(new File("http://192.168.199.111:8080/images/fads"));
		//ע��1����������Դ��������Ŀ¼����ֻ��һ��б�ܲ�ͬ��"e:\\aaaa\\bbbb"�з�б�ܱ��붼��2���������һ��java�ַ����������һ��б�ܵ���������\n�ķ��ţ����϶�����ֻ��һ����б�ܡ�
		//2:"e://aaaa/bbbb"����"e://aaaa//bbbb"������,�������ַ���񣬵����Ƽ��������õ�һ�ֱȽϺ��ʡ�
		//3:����ǰ�˵�img��ǩ���������ַ�����������ַ��
		
		
		
		
	}
}
