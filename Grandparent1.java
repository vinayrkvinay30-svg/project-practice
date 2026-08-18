package vinay1;

class GrandParent1 {
    void bp() {
        System.out.println("Understand bp");
    }
}

class Parent extends GrandParent1 {
    void cancer() {
        System.out.println("Understand");
    }
}

public class Demo extends Parent {
    public static void main(String[] args) {
        Demo bb = new Demo();

        bb.bp();
        bb.cancer();
    }
}