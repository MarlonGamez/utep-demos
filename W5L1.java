import java.util.Arrays; // NEED THIS

public class W5L1 {
    public static void main(String[] args) {
        int[] sortThis = {3, 4, 2, 5, 1};

        selectionSort(sortThis);
        // bubbleSort(sortThis);

        // Arrays.toString(arr) will print arr nicely
        System.out.print(Arrays.toString(sortThis));
    }

    // this method returns void because we're directly
    // modifying the array that's passed in!
    public static void selectionSort(int[] A) {
        // continuously find largest element and swap it
        // with the highest index element of our range
        for (int end = A.length-1; end > 0; end--) {
            // at each iteration, find the largest element
            int maxIndex = findMax(A, end);

            // once we find the largest, lets swap it to the end of our range
            swap(A, maxIndex, end);
        }

    }

    // use this in selectionSort()!
    // [3, 1, 2] -> [2, 1,| 3] -> [1, 2, 3]
    public static int findMax(int[] A, int end) {
        int maxIndex = 0;
        for (int i = 1; i <= end; i++) {
            if (A[i] > A[maxIndex]) maxIndex = i;
        }
        return maxIndex;
    }


    /**************************************************************
     **************************************************************
     **************************************************************/

    // this method returns void because we're directly modifying the array that's passed in!
    public static void bubbleSort(int[] A) {
        // Use to keep track of if we did a swap
        boolean didSwap;

        // loop range continuously shrinks as we bubble
        for (int end = A.length-1; end > 0; end--) {
            // bubble our largest element up the array
            didSwap = bubble(A, end);

            // if we didn't swap, let's return early
            if (!didSwap) {
                return;
            }
        }

    }

    public static boolean bubble(int[] A, int end) {
        // some variable tot keep track of if we swapped
        boolean didSwap = false;

        // bubble our element to the top
        for (int i = 0; i < end; i++) {
            // if two adjacent elements are in increasing order, we swap them
            if (A[i] > A[i+1]) {
                swap(A, i, i+1);

                // if we perform a swap, update didSwap
                didSwap = true;
            }

        }

        return didSwap;
    }

    public static void insertionSort(int[] A) {
        for(int i = 1; i < A.length; i++) {
            insert(A,i);
        }
    }

    public static void insert(int[] A, int indexToBeInserted) {
        int toBeInserted = A[indexToBeInserted];
        int indexToBeChecked = indexToBeInserted - 1;

        while (indexToBeChecked >= 0 && A[indexToBeChecked] > toBeInserted) {
            A[indexToBeChecked+1] = A[indexToBeChecked];

            indexToBeChecked--;
        }

        if (indexToBeChecked < 0) A[0] = toBeInserted;
        else A[indexToBeChecked+1] = toBeInserted;
    }

    // use this for swapping elements in an array
    public static void swap(int[] A, int i1, int i2) {
        int temp = A[i1];
        A[i1] = A[i2];
        A[i2] = temp;
    }
}
