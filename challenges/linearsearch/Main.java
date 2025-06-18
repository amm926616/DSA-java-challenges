package challenges.linearsearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {432, 43124, 80, 2343, 64, 1232, 5456, 326346, 1212625, 123136, 345, 637, 2132};

        System.out.println(doLinearSearch(arr, 4324));
    }

    public static int doLinearSearch(int[] arr, int searchItem) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchItem) {
                return i; // return the index where item is found
            }
        }
        return -1; // item not found - special value for linear search no found

    }
}
