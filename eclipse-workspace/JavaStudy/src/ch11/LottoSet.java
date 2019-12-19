package ch11;

import java.util.HashSet;

public class LottoSet {
	public static void main(String[] args) {

		HashSet<Integer> win = new HashSet<>();
		win.add(8); win.add(14); win.add(17);
		win.add(27); win.add(36); win.add(45);
		
		int count = 0;
		while(true) {
			
		HashSet<Integer> lotto = new HashSet<>();
		while(true) { // 0.0 <= X < 1.0
			int num = (int) (Math.random() * 45 + 1);
			lotto.add(num);
			
			if(lotto.size() == 6) break;
 		}
		System.out.println(lotto);
		count++;
		if (win.containsAll(lotto)) break;
		}
		System.out.println(count);
	}
}
