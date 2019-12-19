package ch04;

import java.util.Scanner;

public class CardApp {
	public static void main(String[] args) {
		int startNum = 0; // �ּ� ī�� ��ȣ
		int endNum = 0; // �ִ� ī�� ��ȣ

		Scanner scan = new Scanner(System.in);

		System.out.print("ī���� ���� ��ȣ�� �Է����ּ���. > ");
		startNum = scan.nextInt(); // ���� ��ȣ �Է�
		while (true) {
			System.out.print("ī���� ������ ��ȣ�� �Է����ּ���. > ");
			endNum = scan.nextInt(); // ������ ��ȣ �Է�
			if (endNum <= startNum) { // ������ ��ȣ�� ���� ��ȣ���� ũ�� �ʴٸ�
				System.out.println("���� ��ȣ���� ū ��ȣ�� �Է����ּ���.");
			} else { // ������ ��ȣ�� ���� ��ȣ���� ũ�ٸ�
				break; // �ݺ��� ���� ����
			}
		}
		int count = 0;
		int cardNum = 0; // �������� ������ ī�� ��ȣ
		while (true) {
			cardNum = (int) (Math.random() * (endNum + 1));
			// ���۰� ������ ��ȣ �������� �������� Ȯ��
			if (cardNum >= startNum && cardNum <= endNum)
				break;
		}
		System.out.println("ī�� ��ȣ�� �Է����ּ���.");
		while (true) {
			int userNum = scan.nextInt();
			if (userNum == 99999) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			if (userNum < startNum || userNum > endNum) {
				System.out.println("�Է� ������ �ʰ��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
				System.out.printf("���۹�ȣ : %s, �����ȣ : %s \n", startNum, endNum);
				continue;
			}
			
			count++;
			if (userNum == cardNum) {
				System.out.println("�������ϴ�.");
				break;

			} else {
				if (userNum > cardNum)
					System.out.println("�Էµ� ���ں��� ī���ȣ�� �����ϴ�.");
				else
					System.out.println("�Էµ� ���ں��� ī���ȣ�� Ů�ϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");

			}
		}
		System.out.println("�õ� Ƚ�� : " + count);
		scan.close();
	}
}