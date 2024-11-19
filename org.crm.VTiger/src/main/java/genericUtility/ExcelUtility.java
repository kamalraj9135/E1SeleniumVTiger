package genericUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	/**
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws Exception
	 */
	
	public String getDataFromExcel(String sheetName, int rowNum, int cellNum) throws Exception {
		FileInputStream f = new FileInputStream(IPathConstant.excelVTigerPath);
		Workbook w = WorkbookFactory.create(f);
		Cell c = w.getSheet(sheetName).getRow(rowNum).getCell(cellNum);
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(c);
//		System.out.println(value);
		return value;
	
		
	}

}
