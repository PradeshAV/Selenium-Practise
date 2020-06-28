package practice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadrivenexcel {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public Datadrivenexcel(String excelpath)
	{
		
		try
		{
			
			File src=new File(excelpath);
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}}
		
		public String getdata(int sheetindex,int row,int column)
		{
			String data1111="";
		sheet1=wb.getSheetAt(sheetindex);
		XSSFCell data=sheet1.getRow(row).getCell(column);
		
		switch(data.getCellType())
		{
		case Cell.CELL_TYPE_NUMERIC:
			Integer res=(int) data.getNumericCellValue();
			 data1111=res.toString();
	break;

		
		case Cell.CELL_TYPE_STRING:
			 data1111=data.getStringCellValue();
			break;
		}
		return data1111;
		}
		public int getrownum(int sheetindex)
		{
		int row1=	wb.getSheetAt(sheetindex).getLastRowNum();
		
		row1=row1+1;
		return row1;
		}
		
		
		
		
	}


