package homework3;

public class ArrayUtil {
    public static void main(String[] args) {
        // 1
        int[] number = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");

        }
        System.out.println("\n-----------------");
//        2
        System.out.println(number[0]);
        System.out.println("\n-----------------");
//        3
        System.out.println(number[number.length - 1]);
        System.out.println("\n-----------------");
//        4
        System.out.println(number.length);
        System.out.println("\n-----------------");
//        5
        int n = number[0];
        for (int i = 0; i < number.length; i++) {
            if (n > number[i]) {
                n = number[i];
            }

        }
        System.out.println(n);
        System.out.println("\n-----------------");

//        6

        if (number.length % 2 == 0) {
            System.out.println("can not print midlle values");
        }
        if (number.length % 2 > 0) {
            int x = number.length / 2;
            System.out.println(number[x]);
        }
        System.out.println("\n-----------------");
//        7
        int even = 0;
        int odd = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                even++;
//8
            }
            if (number[i] % 2 > 0) {
                odd++;

            }


        }
        System.out.println("even length: " + even);
        System.out.println("\n-----------------");
        System.out.println("odd length: " + odd);


//        9
        System.out.println("\n-----------------");
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];

        }
        System.out.println(sum);
//        10
        int midnum = sum / number.length;
        int midnum2 = sum % number.length;
        System.out.println(midnum + "," + midnum2);
    }


}
