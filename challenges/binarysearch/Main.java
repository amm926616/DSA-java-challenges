package challenges.binarysearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(doBinarySearch(arr, 7));

    }

    public static int doBinarySearch(int[] sortedArray, int key) {
        int lowIndex = 0;
        int highIndex = sortedArray.length - 1;

        while ( lowIndex <= highIndex ) {
            int middleIndex = lowIndex + (highIndex - lowIndex) / 2;
            if ( sortedArray[middleIndex] == key ) {
                return middleIndex;
            } else if ( sortedArray[middleIndex] < key ) {
                System.out.printf("too small: %s%n", sortedArray[middleIndex]);
                System.out.println("upper: " + sortedArray[highIndex]);
                System.out.println("lower: " + sortedArray[lowIndex]);
                lowIndex = middleIndex + 1;
            } else {
                System.out.printf("too large: %s%n", sortedArray[middleIndex]);
                System.out.println("upper: " + sortedArray[highIndex]);
                System.out.println("lower: " + sortedArray[lowIndex]);
                highIndex = middleIndex - 1;
            }
        }

        return -1;
    }
}
