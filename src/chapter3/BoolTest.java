package chapter3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b equal " + b);

        b = true;
        System.out.println("b equal " + b);

        if (b) System.out.println("this code is executed ");
        if (b) System.out.println("this code isn't execited ");

        System.out.println("10 > 9 equal " + (10 > 9));
    }
}
