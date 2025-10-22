package homewrok4;

public class Homework3 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 8, 7, 6, 7, 10, 2, 7, 1};
        int repeatableCount = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[i] == numbers[j]){
                    repeatableCount++;
                    break;
                }
            }

        }
        System.out.println(repeatableCount);

    }

}
