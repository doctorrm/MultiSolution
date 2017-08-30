package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * method4 (faster than)> method3 > method2 > method1
 * 
 * @author Doctorwho
 */
public class CopyFileWays {
	public static void main(String[] args) throws Exception {
		method4("d://korean.wma", "d://hellocopy.wma");// music file. PS:java
														// don't directly
														// support mp3 read.
	}

	/**
	 * Buffer read & write byte array.<strong>(RECOMMEND)</strong>
	 * 
	 * @param origin,path
	 *            of file which you want to read.
	 * @param destination,copied
	 *            file path.
	 * @throws IOException
	 */
	@SuppressWarnings("unused")
	private static void method4(String origin, String destination) throws IOException {
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(origin));
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destination));
		byte[] bs = new byte[1024];
		int len = 0;
		while ((len = bufferedInputStream.read(bs)) != -1) {
			bufferedOutputStream.write(bs, 0, len);
		}
		bufferedInputStream.close();
		bufferedOutputStream.close();
	}

	/**
	 * Buffer read & write single byte
	 * 
	 * @param origin
	 * @param destination
	 * @throws IOException
	 */
	// @SuppressWarnings({ "unused", "resource" }):denote just for the syntax
	@SuppressWarnings("unused")
	private static void method3(String origin, String destination) throws IOException {
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(origin));
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destination));
		int len = 0;
		while ((len = bufferedInputStream.read()) != -1) {
			bufferedOutputStream.write(len);
		}
		bufferedInputStream.close();
		bufferedOutputStream.close();

	}

	/**
	 * Basic read & write byte array
	 * 
	 * @param origin
	 * @param destination
	 * @throws IOException
	 */
	@SuppressWarnings("unused")
	private static void method2(String origin, String destination) throws IOException {
		InputStream inputStream = new FileInputStream(origin);
		OutputStream outputStream = new FileOutputStream(destination);
		byte[] bs = new byte[1024];
		int len = 0;
		while ((len = inputStream.read(bs)) != -1) {
			outputStream.write(bs, 0, len);
		}
		inputStream.close();
		outputStream.close();
	}

	/**
	 * Basic read & write single byte
	 * 
	 * @param origin
	 * @param destination
	 * @throws IOException
	 */
	@SuppressWarnings("unused")
	private static void method1(String origin, String destination) throws IOException {
		InputStream inputStream = new FileInputStream(origin);
		OutputStream outputStream = new FileOutputStream(destination);
		int len = 0;
		while ((len = inputStream.read()) != -1) {
			outputStream.write(len);
		}
		inputStream.close();
		outputStream.close();
	}

}
