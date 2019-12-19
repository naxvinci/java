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
		
		int rows = s.getRows(); //��ü �������� �� �� 
		
		for(int i = 0; i < rows; i++) {
			Cell ���� = s.getCell(0, i);
			Cell ���� = s.getCell(1, i);
			Cell ���� = s.getCell(2, i);
			Cell �ۼ��� = s.getCell(3, i);
			System.out.printf(
					"%s,%s,%s,%s\n", ����.getContents(), ����.getContents(), 
					����.getContents(), �ۼ���.getContents());
		}
		
		
		Cell c = s.getCell(0, 0); //0�� 0��
		String contents = c.getContents();
		System.out.println(contents);
	}
}
