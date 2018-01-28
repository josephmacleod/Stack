package stack;

public class TestStack {

    public static void main(String[] args) {
        Stack<String> s;

        for (int choice = 1; choice <= 2; choice++) {
            if (choice == 1) {
                s = new ArrayStack<>();
            } else {
                s = new LinkedStack<>();
            }

            System.out.println(s);
            s.push("one");
            System.out.println(s);
            s.push("two");
            System.out.println(s);
            s.push("three");
            System.out.println(s);
            s.pop();
            System.out.println(s);
            s.pop();
            System.out.println(s);
            s.pop();
            System.out.println(s);
            s.push("four");
            System.out.println(s);
            s.push("five");
            System.out.println(s);
        }
    }
}
