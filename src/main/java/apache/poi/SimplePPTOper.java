package apache.poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.formula.functions.Finance;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFSlideLayout;
import org.apache.poi.xslf.usermodel.XSLFSlideMaster;

public class SimplePPTOper {
	public static void main(String[] args) throws IOException {
		readPPT();
	}

	/**
	 * New a representation.
	 * 
	 * @throws IOException
	 */
	@SuppressWarnings("unused")
	private static void createPPT() throws IOException {
		XMLSlideShow ppt = new XMLSlideShow();
		XSLFSlide slide = ppt.createSlide();
		ppt.close();
	}

	@SuppressWarnings("unused")
	private static void readPPT() throws IOException {
		XMLSlideShow ppt = new XMLSlideShow(new FileInputStream("d://slideshow.pptx"));
		// append a new blank slide to the end.
		XSLFSlide slide = ppt.createSlide();
		ppt.close();
	}

	/**
	 * Create a new slide from a predefined slide layout
	 * 
	 * @throws IOException
	 */
	@SuppressWarnings("unused")
	private static void changePPT() throws IOException {
		XMLSlideShow ppt = new XMLSlideShow(new FileInputStream("d://slideshow.pptx"));

		// first see what slide layouts are available :
		System.out.println("Available slide layouts:");
		for (XSLFSlideMaster master : ppt.getSlideMasters()) {
			for (XSLFSlideLayout layout : master.getSlideLayouts()) {
				System.out.println(layout.getType());
			}
		}

	}
}
