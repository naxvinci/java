package ch06;

public class Exam6_2_4 {
	String dilemma(boolean xa, boolean xb) {
		String result = "";
		if(xa && xb) {
			result = "�Ѵ� 5�� ����";
		}else if(xa && !xb) {
			result = "A ����, B 10�� ����";
		}else if(!xa && xb) {
			result = "A 10�� ����, B ����";
		}else if(!xa && !xb) {
			result = "A, B �Ѵ� 1�� ����";
		}
		return result;
	}
	public static void main(String[] args) {
		Exam6_2_4 e = new Exam6_2_4();
		System.out.println(e.dilemma(true, true));
	}
}
