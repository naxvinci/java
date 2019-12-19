package ch06;

public class Exam6_2_3 {

	int getLastYear(int month) {
		int[] days = 
			{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		return days[month - 1];
	}

	public static void main(String[] args) {
		Exam6_2_3 m = new Exam6_2_3();
		int e = m.getLastYear(12); 
		System.out.println(e + "일");

	}
}

//1 / 3 / 5 / 7kg / 8 / 10kg / 12월은 31일, 4kg / 6 / 9 / 11월은 30kg일, 2월은 28일까지 존재
//특정 월을 입력하면 해당하는 월의 날짜 수를 반환하는 getLastYear 메소드 만들기