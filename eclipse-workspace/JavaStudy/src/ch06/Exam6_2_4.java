package ch06;

public class Exam6_2_4 {
	String dilemma(boolean xa, boolean xb) {
		String result = "";
		if(xa && xb) {
			result = "둘다 5년 복역";
		}else if(xa && !xb) {
			result = "A 석방, B 10년 복역";
		}else if(!xa && xb) {
			result = "A 10년 복역, B 석방";
		}else if(!xa && !xb) {
			result = "A, B 둘다 1년 복역";
		}
		return result;
	}
	public static void main(String[] args) {
		Exam6_2_4 e = new Exam6_2_4();
		System.out.println(e.dilemma(true, true));
	}
}
