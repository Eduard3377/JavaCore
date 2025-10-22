package homewrok5;

public class Sort {
    public static void main(String[] args) {
        int[] array = {4, 7, 1, 3, 9, 0, 2};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                int x = array[i];
                if (array[i] > array[j]) {
                    array[i] = array[j];
                    array[j] = x;
                }

            }
        }
        for (int x = 0; x < array.length; x++){
            System.out.print(array[x] + " ");
        }

    }
}








