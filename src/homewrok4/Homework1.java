package homewrok4;

public class Homework1 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 8, 7, 6, 7, 10, 2, 1};

        int n = 7;
        int count = 0;
        for (int number : numbers) {
            if (n == number) {
                count++;
            }

        }
        System.out.println("count of " + n + " = " + count);
    }

}
