package vinay1;

// poly morphism
//method overloading
// method overriding


class Parents
{
   void property()
   {
	   System.out.println("Property");
   }
   void marry()
   {
	   System.out.println("famaily selected girl/boy");
   }
}
public class Demo extends Parents {
	void marry()
	{
		System.out.println("campus selected girl/boy");
	}
	public static void main(String[] args) {
		Demo test = new Demo();// object
		test.marry();
		test.property();
	
	}
}
