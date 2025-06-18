package challenges.queue;

public class Queue<T> {
    private final T[] arr;
    private int head; // Index of the front element
    private int tail; // Index where the next element will be added
    private int currentSize; // To keep track of the number of elements

    @SuppressWarnings("unchecked") // Suppress warning for type casting
    public Queue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Queue capacity must be positive.");
        }
        // Cannot instantiate generic array directly, so cast Object array
        this.arr = (T[]) new Object[capacity];
        this.head = 0;
        this.tail = 0;
        this.currentSize = 0;
    }

    public void enqueue(T value) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full, cannot enqueue.");
        }
        arr[tail] = value;
        tail = (tail + 1) % arr.length; // Move tail, wrap around if needed
        currentSize++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty, cannot dequeue.");
        }
        T value = arr[head];
        arr[head] = null; // Optional: nullify the reference for garbage collection
        head = (head + 1) % arr.length; // Move head, wrap around if needed
        currentSize--;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty, no element to peek.");
        }
        return arr[head];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == arr.length;
    }

    public int size() {
        return currentSize;
    }
}