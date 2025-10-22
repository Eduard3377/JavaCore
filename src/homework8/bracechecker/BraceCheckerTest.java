package homework8.bracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "Hello (((from) Ja{v]a}}";
        BraceChecker braceChecker = new BraceChecker();
        braceChecker.check(text);
    }
}
