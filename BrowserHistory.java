import java.util.Stack;

public class BrowserHistory {
    Stack<String> back = new Stack<>();
    Stack<String> forward = new Stack<>();
    String currentPage = "Home";

    void visit(String url) {
        back.push(currentPage);
        currentPage = url;
        forward.clear();
        System.out.println("Visited: " + currentPage);
    }

    void goBack() {
        if (!back.isEmpty()) {
            forward.push(currentPage);
            currentPage = back.pop();
            System.out.println("Back to: " + currentPage);
        } else {
            System.out.println("No pages in back history");
        }
    }

    void goForward() {
        if (!forward.isEmpty()) {
            back.push(currentPage);
            currentPage = forward.pop();
            System.out.println("Forward to: " + currentPage);
        } else {
            System.out.println("No pages in forward history");
        }
    }

    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory();
        bh.visit("google.com");
        bh.visit("youtube.com");
        bh.visit("github.com");
        bh.goBack();
        bh.goBack();
        bh.goForward();
    }
}
