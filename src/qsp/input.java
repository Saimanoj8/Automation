package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class input {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis= new FileInputStream("C:\\Users\\bharath reddy\\Desktop\\inputdata.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row r=sh.getRow(4);
		Cell c=r.getCell(0);
	
		String val=c.getStringCellValue();
		System.out.println(val);
		
		
    //	  write the data
	FileInputStream fis1= new FileInputStream("C:\\Users\\bharath reddy\\Desktop\\inputdata.xlsx");
		Workbook wb1= WorkbookFactory.create(fis1);
	Sheet sh1=wb1.getSheet("Sheet1");
	Row r1=sh1.getRow(6);
		Cell c1=r1.createCell(2);
		c1.setCellValue("chakali ailam");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\bharath reddy\\Desktop\\inputdata.xlsx");
	wb1.write(fos);
	System.out.println("done writing");
	Thread.sleep(2000);
		
	//	multiple 
		for (int i=0; i<=9;i++)
		{
			FileInputStream fis3= new FileInputStream("C:\\Users\\bharath reddy\\Desktop\\inputdata.xlsx");
			Workbook wb2= WorkbookFactory.create(fis3);
			Sheet sh2=wb2.getSheet("Sheet1");
			Row r2=sh2.getRow(i);
			Cell c2=r2.getCell(1);
			String val2=c2.getStringCellValue();
			System.out.println(val2);
		}
	 
	}

	

}
