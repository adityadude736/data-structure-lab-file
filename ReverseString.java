import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        Stack<Character> stk = new Stack<>();

        for (char c : str.toCharArray()) {
            stk.push(c);
        }

        String rev = "";
        while (!stk.isEmpty()) {
            rev += stk.pop();
        }

        System.out.println("Reversed: " + rev);
    }
}
