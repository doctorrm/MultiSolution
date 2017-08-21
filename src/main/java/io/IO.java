package io;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class IO {
	public static void  main(String[] args) throws IOException {
		//使用apache的commons-io.jar。而且只能删除文件夹而不是文件。。
		FileUtils.deleteDirectory(new File("http://192.168.199.111:8080/images/fads"));
		//注意1：跟本地资源管理器的目录可以只用一个斜杠不同，"e:\\aaaa\\bbbb"中反斜杠必须都是2个，如果是一个java字符串会把其中一个斜杠当作类似于\n的符号，即肯定不能只有一个反斜杠。
		//2:"e://aaaa/bbbb"或者"e://aaaa//bbbb"都可以,这个和网址很像，但不推荐，还是用第一种比较合适。
		//3:不像前端的img标签，在这里地址不能是虚拟地址。
		
		
		
		
	}
}
