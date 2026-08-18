package vinay;

public class classdemo {
	int a=66;
	static int cc=99;
	void m1() {
		int a=10;
		System.out.println("ghghg"+a);
	}
	public classdemo() {
		int b=10;
		System.out.println("jdh"+b);
	}
	public static void main(String[]args) {
		classdemo test=new classdemo();
		test.m1();
		System.out.println("thank you"+test.a);
		System.out.println(cc);
		System.out.println(classdemo.cc);
	}

	

}
