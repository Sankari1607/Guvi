package task13_class16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAppachie {
	

	public static void main(String[] args) 	{
		// TODO Auto-generated method stub

		
		ExcelAppachie obj = new ExcelAppachie();
		String x;
		
		
		try {
			
			 x = obj.excelRead(1,0);
			System.out.println(x);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		////////////////
		
		
		
		/*try {
			
			obj.excelWrite();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
				
		
		System.out.println("EOP");
		
	}
	
	
	
	
	
	public void excelWrite() throws FileNotFoundException, IOException {
		
		XSSFWorkbook book = new XSSFWorkbook();
		
		XSSFSheet sheet = book.createSheet("Sheet1");
		
		sheet.createRow(0).createCell(0).setCellValue("Name");
		
		sheet.getRow(0).createCell(1).setCellValue("Age");
		sheet.getRow(0).createCell(2).setCellValue("Email");
		sheet.getRow(1).createCell(0).setCellValue("John Doe");
		sheet.getRow(1).createCell(1).setCellValue("30");
		sheet.getRow(1).createCell(2).setCellValue("john@test.com");
		
		/////////
				
		File file = new File(System.getProperty("user.dir") + "\\src\\main\\java\\task13_class16\\Eclipse Testcase2.xlsx");
		
		FileOutputStream output = new FileOutputStream(file);
		
		book.write(output);
		
		///
		
		
		
		book.close();
		
		output.close();
		
		
	}
	
		public String excelRead(int page, int row, int col) throws Exception {
		
		String value = null;
		
		FileInputStream input = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\task13_class16\\Eclipse Testcase.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(input);
		
		XSSFSheet sheet = book.getSheetAt(page);
		
		Row r = sheet.getRow(row);
		
		Cell c = r.getCell(col);
		
		//System.out.println(c);
		
		DataFormatter format = new DataFormatter();
		value = format.formatCellValue(c);
		
		//System.out.println(value);
		
		///////////
		
		//System.out.println(sheet.getRow(0).getCell(0));
		
		book.close();
		input.close();
		
		return value;
		
		
	}
	
	
	
	public String excelRead(int page, int col) throws Exception {
		
		String value = "";
		
		FileInputStream input = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\task13_class16\\Eclipse Testcase.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(input);
		
		XSSFSheet sheet = book.getSheetAt(page);
		
		int size = sheet.getLastRowNum();
		
		for (int i=0; i< size ; i++) {
			value = value + sheet.getRow(i).getCell(col) + " , " ;
		}
		
		//System.out.println(c);
		
		
		
		//System.out.println(value);
		
		///////////
		
		//System.out.println(sheet.getRow(0).getCell(0));
		
		book.close();
		input.close();
		
		return value;
		
		
	}

}
