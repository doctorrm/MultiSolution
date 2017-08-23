package apache.poi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SimpleExcelOper {
	public static void main(String[] args) throws IOException{
		changeXLSXFile();
		readXLSXFile();
	}
	
	// A simple demo that reads an Excel file(read the 1st sheet). 
	public static void readXLSXFile() throws IOException {
		String excelFilePath = "Books.xlsx";
		InputStream inputStream = new FileInputStream(new File(excelFilePath));	
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet firstSheet = workbook.getSheetAt(0);//the index of sheets.
		Iterator<Row> rowsIterator = firstSheet.iterator();
		
		while (rowsIterator.hasNext()) {
			Row nextRow = rowsIterator.next();			
			Iterator<Cell> cellsIterator = nextRow.cellIterator();	
			while (cellsIterator.hasNext()) {
				Cell cell = cellsIterator.next();			
				switch (cell.getCellType()) {//now this return int, which will instead return CellType in future release.
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue());
						break;
					case Cell.CELL_TYPE_BOOLEAN:
						System.out.print(cell.getBooleanCellValue());
						break;
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue());
						break;				
				}
				System.out.print(" - ");
			}
			System.out.println();
		}	
		workbook.close();
		inputStream.close();
	}
	//A simple demo to change a XLSXFile.
	public static void changeXLSXFile() throws IOException{
		InputStream fInputStream=new FileInputStream("D://testWrite.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fInputStream);//tip:XSSF(for Excel 2007 and later) & HSSF(before Excel 2007)		
		XSSFSheet sheet=workbook.createSheet("sheet3");
		for(int r=0;r<6;r++){
			XSSFRow row=sheet.createRow(r);
			for(int c=0;c<6;c++){//iterating c number of columns.
				XSSFCell cell=row.createCell(c);
				cell.setCellValue("Cell "+r+" "+c);
			}
		}
		OutputStream outputStream=new FileOutputStream("D://testWrite.xlsx");
		//write this workbook to the OutputStream.
		workbook.write(outputStream);
		System.out.println("Write to XLSFFile(location is D://testWrite.xlsx) successfully!");
		outputStream.flush();
		outputStream.close();
		workbook.close();
	}
	
}