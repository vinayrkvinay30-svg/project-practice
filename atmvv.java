package vinay1;

	interface Atm {
		abstract void depo();
	}
	interface Atm1 {
		abstract void min();
	}
	public class atmvv implements Atm, Atm1 {
		public void depo() {
			System.out.println("dep");
		}
		public void min() {
			System.out.println("min");
		}
		public static void main(String[] args) {
			atmvv v = new atmvv();
			v.min();
			v.depo();
		}
	}


