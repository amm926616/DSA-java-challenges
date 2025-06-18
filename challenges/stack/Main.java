package challenges.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(43897423);
        stack.push(24324);
        stack.push(4234234);
        stack.push(243242344);
        stack.push(524324324);

        System.out.println(stack.peek());

        System.out.println(stack.pop());
    }
}
