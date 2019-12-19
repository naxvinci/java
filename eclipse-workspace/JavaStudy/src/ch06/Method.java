package ch06;

public class Method {
	/**
	 * 1000을 반환하는 메소드
	 * 
	 * @return
	 */
	int sum() {
		return 1000;
	}

	int sum(int a, int b) {
		return a + b;
	}

	String print(int count, String s) {
		String result = "";
		for (int a = 1; a <= count; a++) {
			for (int b = 1; b <= a; b++) {
			//	System.out.print(s);
				result = result + s;
			}
//			System.out.println();
			result = result + "\n";
		}
		return result;
	}

	public static void main(String[] args) {
		Method m = new Method();
		String r = m.print(7, "@");
		System.out.println(r);
	}
	}