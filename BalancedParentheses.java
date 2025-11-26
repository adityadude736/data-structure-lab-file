import java.util.Stack;

public class BalancedParentheses {
    static boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack<>();

        for (char ch : exp.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') stack.push(ch);
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String exp = "{(a+b)*[c-d]}";
        System.out.println(isBalanced(exp) ? "Balanced" : "Not Balanced");
    }
}
