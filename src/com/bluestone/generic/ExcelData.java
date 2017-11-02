

package com.bluestone.generic;
	import java.io.File;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	

	public class ExcelData {

	/*public static void main(String[] args)throws EncryptedDocumentException,InvalidFormatException,IOException
	{
		//To create a file
		
		File file=new File("./data/input.xlsx");
		Workbook wb= WorkbookFactory.create(file);
		
		//To get sheet
		Sheet sh=wb.getSheet("sheet1");
		
		//To get row
		Row r=sh=sh.getRow(0);
		
		//To get the cells
		
		Cell c=r.getCell(0);
		
		//To get the data
		String data=c.getStringCellValue();
		System.out.println(data);*/
		
		//to get the data from excel file
		
		public static String getData(String patth,String sheet,int rn,int cn)
		{
			try
			{
				File file=new File("./data/input.xlsx");
				String data=WorkbookFactory.create(file).getSheet(sheet).getRow(rn).getCell(cn).getStringCellValue();
				return data;
			}
			
			catch(Exception e)
			{
				return " ";
				
			}
		}
		//To get row count in row
		public static int geRowCount(String path,String sheet)
		{
			try
			{
				File file=new File("./data/input.xlsx");
				int rn=WorkbookFactory.create(file).getSheet(sheet).getLastRowNum();			
				return rn;
			}

			catch(Exception e)
			{
				return 0;
				
			}
		
		}
	
		//to  get Cell count in a row
		
			public static short getCellCount(String path,String sheet,int rn)
			{
				try
				{
					File file=new File(path);
					Short cn=WorkbookFactory.create(file).getSheet(sheet).getRow(rn).getLastCellNum();			
					return cn;
				}

				catch(Exception e)
				{
					return 0;
					
				}
			
			}
		
		
}
