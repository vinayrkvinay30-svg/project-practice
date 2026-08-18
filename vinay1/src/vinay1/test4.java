package vinay1;

public class test4 {
	int a;
	int b;

	void m1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void m2() {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		test4 vv = new test4();
		vv.m1(4, 3);
		vv.m2();
	}
}

