package Homewrok4;

public class Homework4 {
    public static void main(String[] args) {
        char[] chars = {'բ', 'ա', 'ր', 'Ե', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        char[] vowels = {'ա', 'Ե', 'է', 'ո', 'ի', 'ե', 'o'};
        int vowelsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (chars[i] == vowels[j]) {
                    vowelsCount++;
                    break;
                }

            }
        }
        System.out.println(vowelsCount);

    }
}
