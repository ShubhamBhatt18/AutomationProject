package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataDriven {

	public FileInputStream fis;
    public XSSFWorkbook workbook;
    public Logger log=LogManager.getLogger(DataDriven.class.getName());
    
    ArrayList<String> a=new ArrayList<String>();
   
   public ArrayList<String> extractData() throws IOException {
	   fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/resources/dataDrivenAuto.xlsx");
	   
	   //Give access to excel sheet
	   workbook=new XSSFWorkbook(fis);
	   
	   //Get the total number of sheet
	   int sheets=workbook.getNumberOfSheets();
	   log.info("Number of sheet",sheets);
	   
	   //to extract first sheet
	   
	   for(int i=0;i<sheets;i++) {
		   if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
			   log.info("sheet1 extracted");
			   
			   XSSFSheet sheet=workbook.getSheetAt(i);
			   
			   //Identify the test cases column by scanning the entire 2nd row.
			   
			   Iterator<Row> rows=sheet.iterator();
			   rows.next();
			
			   Row secondRow=rows.next();
			   
			  
			   
			   Iterator<Cell> ce=secondRow.cellIterator();
			   
			   while(ce.hasNext()) {
				   
				   //ce.next-->return the next element in iteration
				   //stringCellValue-->returns of the cell as string
				   
				  
				   
				   Cell cellValue=ce.next();
				   if(cellValue.getCellTypeEnum()==CellType.STRING) {
					  
				  a.add(cellValue.getStringCellValue());
				  log.info("String value added");
				  //System.out.println("Email "+cellValue.getStringCellValue());
				 //System.out.println("String ghussa");
				   }
				   else if(cellValue.getCellTypeEnum()==CellType.NUMERIC) {
					 //this will convert your numeric value to string
					   a.add(NumberToTextConverter.toText(cellValue.getNumericCellValue()));
					   
					  
					   log.info("Numeric value converted to string added");
					  
				   }
				   else{
					   
					  String s=cellValue.toString();
				  // a.add(NumberToTextConverter.toText(ce.next().getNumericCellValue()));
					  a.add(s);
				   log.info("AlphaNumeric value converted to string added");
				   
				   }
			   }
			   break;
		   }
		   else {
			   log.error("Sheet not found");
			   continue;
		   }
	   }
	   return a;
   }
}
