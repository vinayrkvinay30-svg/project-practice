package vinay1;

class Grandparent
{public static void main(String[] args) {
		Child  bb= new Child();
		bb.bp();
		bb.cancer();}
	void bp()
	{
		System.out.println(" understain   bp");
	}
}
class Parent extends Grandparent
{
	void cancer()
	{
		System.out.println(" understain");
	}
	
}

class Child extends Parent{

	
}

