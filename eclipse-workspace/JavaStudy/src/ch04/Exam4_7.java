package ch04;

public class Exam4_7 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 1000; i++) {
//	1 ~ 1000 사이의 숫자 중 3을 포함하고 있는 숫자를 출력
			int num = i; // 원본 값인 i를 훼손하지 않고 복사본인 num 변수를 통해 연산하기 위해
			while (num > 0) {
				int n = num % 10;
				if (n % 10 == 3) {
					count++;
//					System.out.println(i + ": 3 포함"); //다시 결과로 나올 값은 고로 num이 아니라 i
//					break;
				}
				num = num / 10;
			}
		}
		System.out.println(count);
	}
}