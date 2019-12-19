package ch07;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {
	public static void main(String[] args) {

		JFrame frame = new JFrame("윈도우");
		JButton btn = new JButton("버튼");
		btn.setBackground(Color.YELLOW);
		
		frame.add(btn);
		
		frame.setBounds(200, 200, 200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

		
//		//참조 자료형
//		Member m1 = new Member();
//		Member m2 = new Member();
//		m1.age = 30;
//		m2 = m1;
//		m2.age = 20;
//		System.out.println(m1.age);
//		System.out.println(m2.age);
//		
//		
//		//기본 자료형
//		int a = 10;
//		int b = 5;
//		a = b;
//		a = 1000;
//		System.out.println(a);
//		System.out.println(b);

		// JFrame j = new JFrame();
//				
//		j.setTitle("윈도우2");
//		
//		j.setSize(300, 200);
//		
//		j.setVisible(true);
//		
	}

}
