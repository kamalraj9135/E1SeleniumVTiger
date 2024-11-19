package section3;

import genericUtility.ExcelUtility;

public class DataDrivenExcel {

	public static void main(String[] args) throws Exception {
//		FileInputStream f = new FileInputStream("C:\\Users\\User\\OneDrive\\Desktop\\Selenium\\Section 3\\Book1.xlsx");
//		Workbook w = WorkbookFactory.create(f);
//		Cell c = w.getSheet("Sheet1").getRow(8).getCell(2);
//		DataFormatter df = new DataFormatter();
//		String value = df.formatCellValue(c);
//		System.out.println(value);
		
		
		ExcelUtility eu = new ExcelUtility();
		String value = eu.getDataFromExcel("Sheet1", 2, 0);
		System.out.println(value);
		String value1 = eu.getDataFromExcel("Sheet1", 5, 1);
		System.out.println(value1);
		String value2 = eu.getDataFromExcel("Sheet2", 10, 0);
		System.out.println(value2);
	}

}
