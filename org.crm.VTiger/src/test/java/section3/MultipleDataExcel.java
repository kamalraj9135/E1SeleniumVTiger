package section3;

import java.awt.Robot;
//import java.io.FileInputStream;

//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//
//import genericUtility.MultipleDataExcelUtility;

public class MultipleDataExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		FileInputStream fis = new FileInputStream("C:\\Users\\User\\OneDrive\\Desktop\\Selenium\\Section 3\\Book1.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Sheet3");
//		System.out.println(sh.getLastRowNum());
//		DataFormatter df = new DataFormatter();
//		for(int i=2; i<=sh.getLastRowNum(); i++)
//		{
//			Row r = sh.getRow(i);
//			for(int j=0; j<r.getLastCellNum(); j++)
//			{
//				Cell c = r.getCell(j);
//				String value = df.formatCellValue(c);
//				System.out.println(value);
//			}
//		}

//		MultipleDataExcelUtility m = new MultipleDataExcelUtility();
//		System.out.println(m.get);
		
		Robot r = new Robot();
		r.keyPress(0);
	}

}
