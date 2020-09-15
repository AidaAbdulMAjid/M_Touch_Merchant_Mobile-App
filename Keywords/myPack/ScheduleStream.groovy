package myPack
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import internal.GlobalVariable
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFCellStyle
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import internal.GlobalVariable

public class ScheduleStream {

	private  static int i=0;

	@Keyword
	public static void demoKey(String name,String Column_Name) throws IOException{
		FileInputStream fis = new FileInputStream(GlobalVariable.ScheduleStreamLog);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		//int rowCount = i;
		int rowCount =sheet.getLastRowNum()-sheet.getFirstRowNum();
		if (Column_Name=='title'){
			Row row = sheet.createRow(rowCount+1);
			Cell cell = row.createCell(0,0);
			cell.setCellType(cell.CELL_TYPE_STRING);
			cell.setCellValue(name);
		}


		if (Column_Name=='title image path'){
			Row row2 = sheet.getRow(rowCount);
			Cell cell2 = row2.createCell(1,0);
			cell2.setCellType(cell2.CELL_TYPE_STRING);
			cell2.setCellValue(name);
			i = rowCount+1;
		}
		if (Column_Name=='description'){
			Row row3 = sheet.getRow(rowCount);
			Cell cell3 = row3.createCell(2,0);
			cell3.setCellType(cell3.CELL_TYPE_STRING);
			cell3.setCellValue(name);
			i = rowCount+1;
		}
		if (Column_Name=='description image path'){
			Row row4 = sheet.getRow(rowCount);
			Cell cell4 = row4.createCell(3,0);
			cell4.setCellType(cell4.CELL_TYPE_STRING);
			cell4.setCellValue(name);
			i = rowCount+1;
		}
		if (Column_Name=='date'){
			Row row5 = sheet.getRow(rowCount);
			Cell cell5 = row5.createCell(4,0);
			cell5.setCellType(cell5.CELL_TYPE_STRING);
			cell5.setCellValue(name);
			i = rowCount+1;
		}
		if (Column_Name=='date image path'){
			Row row6 = sheet.getRow(rowCount);
			Cell cell6 = row6.createCell(5,0);
			cell6.setCellType(cell6.CELL_TYPE_STRING);
			cell6.setCellValue(name);
			i = rowCount+1;
		}
		if (Column_Name=='hour'){
			Row row7 = sheet.getRow(rowCount);
			Cell cell7 = row7.createCell(6,0);
			cell7.setCellType(cell7.CELL_TYPE_STRING);
			cell7.setCellValue(name);
			i = rowCount+1;
		}
		if (Column_Name=='hour image path'){
			Row row8 = sheet.getRow(rowCount);
			Cell cell8 = row8.createCell(7,0);
			cell8.setCellType(cell8.CELL_TYPE_STRING);
			cell8.setCellValue(name);
			i = rowCount+1;
		}
		if (Column_Name=='minute'){
			Row row9 = sheet.getRow(rowCount);
			Cell cell9 = row9.createCell(8,0);
			cell9.setCellType(cell9.CELL_TYPE_STRING);
			cell9.setCellValue(name);
			i = rowCount+1;
		}
		if (Column_Name=='minute image path'){
			Row row10 = sheet.getRow(rowCount);
			Cell cell10 = row10.createCell(9,0);
			cell10.setCellType(cell10.CELL_TYPE_STRING);
			cell10.setCellValue(name);
			i = rowCount+1;
		}
		if (Column_Name=='minute image path'){
			Row row11 = sheet.getRow(rowCount);
			Cell cell11 = row11.createCell(10,0);
			cell11.setCellType(cell11.CELL_TYPE_STRING);
			cell11.setCellValue(name);
			i = rowCount+1;
		}
		if (Column_Name=='result'){
			Row row12 = sheet.getRow(rowCount);
			Cell cell12 = row12.createCell(11,0);
			cell12.setCellType(cell12.CELL_TYPE_STRING);
			cell12.setCellValue(name);
			i = rowCount+1;
		}
		if (Column_Name=='result image path'){
			Row row13 = sheet.getRow(rowCount);
			Cell cell13 = row13.createCell(12,0);
			cell13.setCellType(cell13.CELL_TYPE_STRING);
			cell13.setCellValue(name);
			i = rowCount+1;
		}
		//		if (Column_Name=='Amount Image Path'){
		//			Row row14 = sheet.getRow(rowCount);
		//			Cell cell14 = row14.createCell(13,0);
		//			cell14.setCellType(cell14.CELL_TYPE_STRING);
		//			cell14.setCellValue(name);
		//			i = rowCount+1;
		//		}
		//		if (Column_Name=='From Account'){
		//			Row row15 = sheet.getRow(rowCount);
		//			Cell cell15 = row15.createCell(14,0);
		//			cell15.setCellType(cell15.CELL_TYPE_STRING);
		//			cell15.setCellValue(name);
		//			i = rowCount+1;
		//		}
		//		if (Column_Name=='From Account Image Path'){
		//			Row row16 = sheet.getRow(rowCount);
		//			Cell cell16 = row16.createCell(15,0);
		//			cell16.setCellType(cell16.CELL_TYPE_STRING);
		//			cell16.setCellValue(name);
		//			i = rowCount+1;
		//		}
		//		if (Column_Name=='UAT Image Path'){
		//			Row row17 = sheet.getRow(rowCount);
		//			Cell cell17 = row17.createCell(16,0);
		//			cell17.setCellType(cell17.CELL_TYPE_STRING);
		//			cell17.setCellValue(name);
		//			i = rowCount+1;
		//		}
		//		if (Column_Name=='Result'){
		//			Row row18 = sheet.getRow(rowCount);
		//			Cell cell18 = row18.createCell(17,0);
		//			cell18.setCellType(cell18.CELL_TYPE_STRING);
		//			cell18.setCellValue(name);
		//			i = rowCount+1;
		//		}
		//
		//		if (Column_Name=='Result Image Path'){
		//			Row row19 = sheet.getRow(rowCount);
		//			Cell cell19 = row19.createCell(18,0);
		//			cell19.setCellType(cell19.CELL_TYPE_STRING);
		//			cell19.setCellValue(name);
		//			i = rowCount+1;
		//		}

		FileOutputStream fos = new FileOutputStream(GlobalVariable.ScheduleStreamLog);
		workbook.write(fos);
		fos.close();
	}

}
