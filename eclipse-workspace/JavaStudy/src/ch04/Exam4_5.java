package ch04;

public class Exam4_5 {
	public static void main(String[] args) {
		boolean isContinue = true;
		int count = 0;

		while (isContinue) {
			int num1 = (int) (Math.random() * 6 + 1);
			int num2 = (int) (Math.random() * 6 + 1);
			
// 두개의 주사위를 던졌을때 나오는 눈을 (눈1, 눈2) 형태로 출력하고,
// 눈의 합이 10이면 실행을 종료하는 코드 작성 (Math.random() 메소드)
			// 코드 작성
			System.out.printf("(%s, %s)\n" , num1, num2);
			count = count + 1; // count++;
			if(num1 + num2 == 10) {isContinue = false;//혹은 break;를 써도됨 
			}
		}
		System.out.println("주사위를 던진 횟수 : " + count);
	}
}
