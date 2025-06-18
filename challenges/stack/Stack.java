package challenges.stack;

public class Stack {
    private final int[] stack;
    private int currentIndex = 0;

    public Stack(int size) {
        this.stack = new int[5];
        this.currentIndex = 0;
    }

    public void push(int value) {
        try {
            this.stack[currentIndex] = value;
            if (currentIndex == this.stack.length - 1) {
                currentIndex = 0;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stack overflow");
        }
    }

    public int pop() {
        if (this.stack.length == 0) {
            throw new IllegalStateException("Stack underflow");
        }

        int value = this.stack[currentIndex];
        stack[currentIndex] = 0;
        currentIndex--;
        return value;
    }

    public int peek() {
        return this.stack[currentIndex];
    }

    public boolean isEmpty() {
        return this.stack.length == 0;
    }
}