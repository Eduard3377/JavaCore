package Lesson;

public class Stack {
    int[] array = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full");
        } else {
            array[++tos] = item;
        }

    }

    int pop() {
        if (tos < 0) {
            System.out.println("The stack is not loaded.");
            return 0;
        }else {
            return array[tos--];
        }
    }

}
