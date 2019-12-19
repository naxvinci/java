package excel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Test {
	public static void main(String[] args) throws BiffException, IOException {
		File file = new File("excel.xls");
		Workbook w = Workbook.getWorkbook(file);
		Sheet s = w.getSheet(0);
		
		int rows = s.getRows(); //전체 데이터의 행 수 
		
		for(int i = 0; i < rows; i++) {
			Cell 순번 = s.getCell(0, i);
			Cell 제목 = s.getCell(1, i);
			Cell 내용 = s.getCell(2, i);
			Cell 작성자 = s.getCell(3, i);
			System.out.printf(
					"%s,%s,%s,%s\n", 순번.getContents(), 제목.getContents(), 
					내용.getContents(), 작성자.getContents());
		}
		
		
		Cell c = s.getCell(0, 0); //0열 0행
		String contents = c.getContents();
		System.out.println(contents);
	}
}
