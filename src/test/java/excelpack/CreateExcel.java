package excelpack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {
	public static void main(String[] args) throws Throwable {
		File f = new File("C:\\Users\\KASI\\Desktop\\Book5.xlsx");
		FileInputStream f1 = new FileInputStream(f);;
		Workbook w = new XSSFWorkbook(f1);
		Sheet s = w.createSheet("Sheet2");
		Row r = s.createRow(0);
		
//		Cell cell=r.createCell(0);
//		cell.setCellValue("karthi");
//		
//		Cell cell1=r.createCell(1);
//		cell1.setCellValue("kasi");
//		
//		Cell cell2=r.createCell(2);
//		cell2.setCellValue("msd");
		
		
		for(int i=0;i<=5;i++) {
			Cell cell=r.createCell(i);
			cell.setCellValue("karthi");
			
		}
		FileOutputStream f2 = new FileOutputStream(f);
		w.write(f2);
		f2.close();

}
}
