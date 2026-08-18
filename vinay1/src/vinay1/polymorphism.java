package vinay1;

public class polymorphism {

    void minbal() {
        System.out.println("sdfa");
    }

    void minbal(int a) {
        System.out.println("dfasdfasdfasfas");
    }

    public static void main(String[] args) {
        polymorphism test = new polymorphism();

        test.minbal();      // calls minbal()
        test.minbal(3);     // calls minbal(int)
    }
}