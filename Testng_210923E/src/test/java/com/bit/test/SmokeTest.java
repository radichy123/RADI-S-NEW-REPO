package com.bit.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest {
	//to helps to track the behavior the 
	 @Test
	  public void test1() {
		 System.out.println("test1");
	  }

	 
	 ////class name exception handling?
	 // what is exception ?
	 //ans:
	 /*
	  * 
	  * 
	  * 
	  * 
	  * 
	  * 
	  * 
	  * 
	  * 
	  */
	 FileReader f;
	 BufferedReader bf;
	 Object [][] o;
	 @Test
	 public void readtxtFile() throws IOException {
		 try {
			f=new FileReader(new File("path of the file ,///Users/radichowdhury/eclipse-workspace/Testng_210923E/Book1.txt"));
			bf=new BufferedReader(f);
//		try {
			String line =	 bf.readLine();
			while(line!=null) {
				System.out.println(line);
				line=bf.readLine();
				
			}
			
		 }catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("file not fond");
				System.exit(0);//0 means positive . and -21 means negative
			}
		 
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("cannot read line ");
		}//only read the first line 
		 
		 finally {
			 if(f!= null) {
				 f.close();
			 }
			 if(bf!= null) {
				 bf.close();
			 }//no matter pass or fail , this block will get executed
			 
		
	 }//to read excel sheet we need poi dependencies 
		 
		
		}
	 @DataProvider(name= "logIn")
	 public Object [][] readExcelSheet() throws IOException {
		 //.xls > .xlsx , extension.newer version
		 try {
			FileInputStream f=new FileInputStream(new File("/Users/radichowdhury/eclipse-workspace/Testng_210923E/data.xlsx"));
			
			XSSFWorkbook book= new XSSFWorkbook(f);
		XSSFSheet sheet=	book.getSheetAt(0);
		//XSSFCell cell=	sheet.getRow(2).getCell(1);
		//cell.getStringCellValue();
		 o=new Object [sheet.getLastRowNum()] [sheet.getRow(0).getFirstCellNum()];
		for(int i=1; i<=sheet.getLastRowNum();i++) {
			for(int j=0;j<=sheet.getRow(0).getFirstCellNum();j++ ) {
				XSSFCell cell	=sheet.getRow(i).getCell(j);
				switch(cell.getCellType()) {
				case XSSFCell.CELL_TYPE_STRING:{
				o [i-1][j]=	cell.getDateCellValue();
				}
				case XSSFCell.CELL_TYPE_NUMERIC:{
					o [i-1][j]=	cell.getDateCellValue();
				}
				
				}
				
			}
			
		}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return o;
		 
		}
	 
	 
} 
		 
		
	

