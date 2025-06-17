package challenges.stack;

public class Stack {
    int[] intArray;
    int maxSize;
    int currentIndex;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        intArray = new int[maxSize];
    }

    public Stack() {
        this.maxSize = 0;
        intArray = new int[maxSize];
    }

    // push, pop, peek, and isEmpty

    public void push(int newInt) {
        try {
            intArray[currentIndex] = newInt;
            currentIndex++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stack Overflow");
        }
    }

    public int pop() {
        // delete, return the value of current index
        int value = intArray[currentIndex];
        intArray[currentIndex] = 0;
        currentIndex--;
        return value;
    }

    public int peek() {
        return intArray[currentIndex - 1];
    }

    public boolean isEmpty() {
        return currentIndex == 0;
    }

    public void show() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
