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
		System.out.println(e + "��");

	}
}

//1 / 3 / 5 / 7kg / 8 / 10kg / 12���� 31��, 4kg / 6 / 9 / 11���� 30kg��, 2���� 28�ϱ��� ����
//Ư�� ���� �Է��ϸ� �ش��ϴ� ���� ��¥ ���� ��ȯ�ϴ� getLastYear �޼ҵ� �����