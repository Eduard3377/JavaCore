package homewrok4;

public class Homework2 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 8, 7, 6, 7, 10, 2, 1};
        int lastIndex = numbers.length - 1;
        int tmp;
        for (int i = 0; i < numbers.length / 2; i++) {
            tmp = numbers[i];
            numbers[i] = numbers[lastIndex];
            numbers[lastIndex] = tmp;
            lastIndex--;
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
