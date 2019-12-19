package ch06;

public class Exam6_1 {
	// plus 메소드 작성
	int plus(int a, int b) {
		return a + b;
	}
	// minus 메소드 작성
	int minus(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		Exam6_1 e = new Exam6_1();

		int result1 = 0;
// result1 변수에 plus 메소드 호출 결과 저장
		result1 = e.plus(5, 3);
		System.out.println(result1);
// plus 메소드 호출 예) xx.plus(5, 3);
		int result2 = 0;
// result2 변수에 minus 메소드 호출 결과 저장
		result2 = e.minus(5, 3);
		System.out.println(result2);
// minus 메소드 호출 예) xx.minus(5, 3);
	}
}
