package homework2;

public class Homework2 {
    public static void main(String[] args) {
//        1
        for (int i = 0; i < 5; i++) {

            for (int x = 0; x <= i; x++) {
                System.out.print("* ");
            }
            System.out.println("  ");

        }
        System.out.println("++++++++++++++++++");


//        2
        for (int i = 5; i > 0; i--) {

            for (int x = 0; x < i; x++) {
                System.out.print("* ");
            }
            System.out.println(" ");

        }
        System.out.println("++++++++++++++++++");
//        3
        for (int i = 1; i <= 5; i++) {
            for (int x = 5; x > i; x--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("++++++++++++++++++");

        for (int i = 5; i >= 1; i--) {
            for (int x = 5; x > i; x--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("++++++++++++++++++");

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int x = n; x > i; x--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
