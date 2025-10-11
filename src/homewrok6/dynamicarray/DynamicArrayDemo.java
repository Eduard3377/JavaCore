package homewrok6.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        for (int i = 0; i < 50; i++) {
            dy.add(i + 1);
        }

        dy.print();

        int byIndex = dy.getByIndex(1);
        System.out.println(byIndex);
    }
}
