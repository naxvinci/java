package ch06;

public class Exam6_2_1 {
	
	int checkGrade(int a) {
		int result = 0;
		if(a>10) {
			result = 1;
		}else if(a>7) {
			result = 2;
		}else if(a>4) {
			result = 3;
		}else {
			result = 4;
		}
		return result;
	}

	
	public static void main(String[] args) {
		Exam6_2_1 e = new Exam6_2_1();
		System.out.println(e.checkGrade(5));
	}
}
