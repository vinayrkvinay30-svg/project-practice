package vinay1;

public class Dmeo {

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {

        Dmeo test = new Dmeo(); // object

        test.setA(11);

        int aa = test.getA();

        System.out.println(aa);
    }
}