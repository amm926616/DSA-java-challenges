package challenges.maximumInteger;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // plan

        int[] intArray = {12, 47, 3, 89, 5, 23, 56, 91, 17, 34};

        int tempInt = 0;

        for (int i: intArray) {
            if (i > tempInt) {
                tempInt = i;
            }
        }

        System.out.println("The Maximum number is " + tempInt);
        // Yup. It is my idea.

        // check out what stream in java can do.
        System.out.println(Arrays.stream(intArray).max().getAsInt());
    }
}
