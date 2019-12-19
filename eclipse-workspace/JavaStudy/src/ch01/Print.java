package ch01;

//Ctrl+F11:실행
//Shift+Ctrl+F: 소스코드 정렬
public class Print {
	public static void main(String[] args) {
		// 더하기와 곱하기 연산의 경우 곱하기가 더 우선 순위로 연산
		System.out.println(1 + 3 * 4);
		// 괄호를 사용하면 최우선 순위로 연산
		System.out.println((1 + 3) * 4);
		System.out.println("큰따옴표 안에서는 '작은따옴표' 사용 가능");
		System.out.println("큰따옴표 안에서 \"큰따옴표\"를 사용하려면 예외문자(\\)를 사용");
		// 작은따옴표는 문자 한개를 표현할때 사용
		System.out.println('문');
		// 여러 기호의 조합
		System.out.println("A의 점수 합은 : " + (1 + 2) + ", B의 점수 합은 : " + (3 + 4));
	}

}
