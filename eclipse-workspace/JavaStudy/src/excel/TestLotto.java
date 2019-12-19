package excel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TestLotto {
	public static void main(String[] args) throws BiffException, IOException {
		File file = new File("lotto.xls");
		Workbook w = Workbook.getWorkbook(file);
		Sheet s = w.getSheet(0);
		
		int rows = s.getRows(); //전체 데이터의 행 수 
		int count =0;
		
		for(int i = 3; i < rows; i++) {
			

			String a = s.getCell(13, i).getContents();
			int d1 = Integer.parseInt(a);	
			String b = s.getCell(14, i).getContents();
			int d2 = Integer.parseInt(b);	
			String c = s.getCell(15, i).getContents();
			int d3 = Integer.parseInt(c);	
			String d = s.getCell(16, i).getContents();
			int d4 = Integer.parseInt(d);	
			String e = s.getCell(17, i).getContents();
			int d5 = Integer.parseInt(e);	
			String f = s.getCell(18, i).getContents();
			int d6 = Integer.parseInt(f);	
			String bonus = s.getCell(19, i).getContents();
			int d7 = Integer.parseInt(bonus);	
			

			if(d1 + d2 == d3 && d6 >= 35) {
				count++;				
			System.out.printf(
					"%s %s %s %s %s %s %s\n", a, b, c, d, e, f, bonus);
			}
		}
		
		
		System.out.println(count);
	}
}
