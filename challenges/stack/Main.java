package challenges.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(132132); // 0
        System.out.println(stack.pop());
        stack.push(2321321);
        stack.isEmpty();
        stack.push(313213);
        stack.push(413123);
        System.out.println(stack.pop());
        stack.push(131235);
        stack.push(613213);
        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());
        System.out.println(stack.currentIndex);
        stack.show();
    }
}
