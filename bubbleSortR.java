public class bubbleSortR {
    public static void sortRows(int[] arr) {
        bSR(arr, arr.length-1);
    }
    public static void bSR(int[] arr , int end) {
        // base case: end reaches bottom

        bubble(arr, 0, end);

        bSR(arr, end-1);
    }

    public static void bubble(int[] arr, int i, int end) {
        // base case i reaches end

        // check if value at i > i+1
        // swap
        bubble(arr, i+1, end);
    }
}