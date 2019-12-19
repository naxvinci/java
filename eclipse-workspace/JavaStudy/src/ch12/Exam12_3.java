package ch12;

public class Exam12_3 {
	public static void main(String[] args) {
		String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		// 무한반복, indexOf, substring 활용
		int idx = 0;
		while(true) {
			idx = str.indexOf(" ", idx +1);
			if(idx == -1) break;
			String result = str.substring(0, idx);
			System.out.println(result);
		}
		System.out.println(str);
	}
}

//출력결과
//동해물과
//동해물과 백두산이
//동해물과 백두산이 마르고
//동해물과 백두산이 마르고 닳도록
//동해물과 백두산이 마르고 닳도록 하느님이
//동해물과 백두산이 마르고 닳도록 하느님이 보우하사
//동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라
//동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세