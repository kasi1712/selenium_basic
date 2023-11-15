package excelpack;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavenExcel {
	public static void main (String[] args) throws Throwable {
		
		File f = new File("C:\\Users\\KASI\\Desktop\\Book5.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1);
		Sheet s = w.getSheet("Sheet1");
		for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
			Row r = s.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
				Cell c = r.getCell(j); 
				int ct = c.getCellType();	
				if(ct==1) {
					String s1 = c.getStringCellValue();
					System.out.println(s1);
				}
				else if(ct==0){
					if(DateUtil.isCellDateFormatted(c)) {
						Date d =c.getDateCellValue();
						SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
						String val = sd.format(d);
						System.out.println(val);
											}
					else {
						double d = c.getNumericCellValue();
						long l =(long)d;
						String value = String.valueOf(l);
						System.out.println(value);
					}
				}
				
				
				
				
			}
		}
		
	}
}
