package ch07;
public class Exam7_3 {
 public static void main( String[] args) {
 /* Class7_3�� method1(new / static ) ȣ�� */
	 Class7_3.method1();
 }
}
class Class7_3 {
 int a;

 public static void method1() {
 System.out.println( "method1 ���� ����");
 
 Class7_3 e = new Class7_3();

 for(int i = 0; i < 5; i++) {
 /* method2�� ȣ���� �� �ֵ��� �ڵ� �ۼ� */
	 e.method2();
	 
 }
 System.out.println("method1 ���� ����");
 }
 public void method2() {
 /* �������� a�� ���� 1�� ���� */
 /* �������� a�� �� ��� */
	 a= a+1;
	 System.out.println(a);
 }
}