package apache.poi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class SimpleWordOper{
	
	public static void main(String[] args) throws IOException {
		changeXWPFFile();
		readXWPFFile();
	}
	
	@SuppressWarnings("unused")
	private static void readXWPFFile() throws IOException{			
		InputStream fInputStream=new FileInputStream("D://wordviajava.docx");
		XWPFDocument document=new XWPFDocument(fInputStream);		
		//METHOD 1	:FOR SPECIFIC EXTRACTION
		/*		Iterator<XWPFParagraph> iterator=document.getParagraphsIterator();
				while(iterator.hasNext()){
					XWPFParagraph xwpfParagraph=iterator.next();
					System.out.println(xwpfParagraph.getText());			
				}
				document.close();*/
				
		//METHOD 2		
		XWPFWordExtractor wordExtractor=new XWPFWordExtractor(document);
		String result=wordExtractor.getText();
		System.out.println(result);
		wordExtractor.close();
	}
	
	@SuppressWarnings("unused")
	private static void changeXWPFFile() throws IOException{
		InputStream fInputStream=new FileInputStream("D://wordviajava.docx");
		XWPFDocument document=new XWPFDocument(fInputStream);
		XWPFParagraph xwpfParagraph=document.createParagraph();			
		XWPFRun xwpfRun=xwpfParagraph.createRun();
		xwpfRun.setText("A add new one paragraph!hoo!");
		OutputStream fOutputStream=new FileOutputStream("D://wordviajava.docx");
		document.write(fOutputStream);
		document.close();
	}
}
