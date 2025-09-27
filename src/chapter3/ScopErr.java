package chapter3;

public class ScopErr {
    public static void main(String[] args) {
        int bar = 1;
        {
//           int bar = 2;     a new scope is created
//                            Compilation error
//                            variable bar is already defined!
        }
    }
}
