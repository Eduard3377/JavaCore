package homework8.bracechecker;

public class BraceChecker {
    private Stack stack = new Stack();

    public void check(String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int last;
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case '}':
                    last = stack.pop();
                    if (last == 0) {
                        System.err.println("Error: Closed } but not opened");
                    } else if (last != '{') {
                        System.err.println("Error: Closed } but opened " + (char) last);
                    }
                    break;
                case ']':
                    last = stack.pop();
                    if (last == 0) {
                        System.err.println("Error at " + i + ": Closed ] but not opened");
                    } else if (last != '[') {
                        System.err.println("Error at " + i + " Closed ] but opened " + (char) last);
                    }
                    break;
                case ')':
                    last = stack.pop();
                    if (last == 0) {
                        System.err.println("Error at " + i + ": Closed ) but not opened");
                    }else if (last != '{') {
                        System.err.println("Error at " + i + ": Closed ) but opened " + (char) last);
                    }
                    break;
            }
        }
    }
}

