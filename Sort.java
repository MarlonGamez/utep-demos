import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = new int[]{6,5, 4, 3, 2, 1};
        arr = mergeSort(arr);

        System.out.print(Arrays.toString(arr));

    }

    public static void selectionSort(int[] A) {
        int maxIndex;

        for (int end = A.length-1; end > 0; end--) {
            maxIndex = findMax(A, end);

            swap(A, maxIndex, end);
        }
    }

    public static int findMax(int[] A, int end) {
        int maxIndex = 0;
        for (int i = 1; i <= end; i++) {
            if (A[i] > A[maxIndex]) maxIndex = i;
        }

        return maxIndex;
    }

    public static void bubbleSort(int[] A) {
        boolean didSwap;

        for (int end = A.length-1; end > 0; end--) {
            didSwap = bubble(A, end);
            if (!didSwap) return;
        }
    }

    public static boolean bubble(int[] A, int end) {
        boolean didSwap = false;

        for (int i = 0; i < end; i++) {
            if (A[i] > A[i+1]) {
                swap(A, i, i+1);

                didSwap = true;
            }
        }

        return didSwap;
    }

    public static void swap(int[] A, int i1, int i2) {
        int temp = A[i1];
        A[i1] = A[i2];
        A[i2] = temp;
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low >= high) return;

        int pi = partition(arr, low, high);
        quicksort(arr, low, pi-1);
        quicksort(arr, pi+1, high);

    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int partitioned = low;

        for (int i = low + 1; i < high; i++) {
            if (arr[i] < pivot) {
                partitioned++;

                // swap
                int temp = arr[i];
                arr[i] = arr[partitioned];
                arr[partitioned] = temp;
            }
        }

        // swap
        int temp = arr[low];
        arr[low] = arr[partitioned];
        arr[partitioned] = temp;

        return partitioned;
    }

    public static int[] mergeSort(int[] A) {
        // if the array has 0 or 1 element, it is sorted. We are
        // done: we return = exit.
        if(A.length<= 1) return A;

        // if the array has at least 2 elements, we need to break it     // down into 2 arrays the left part:
        int[] L= new int[A.length/2];

        // the right part:
        int[] R= new int[A.length-A.length/2];

        // we then fill these two subarrays
        for(int i=0; i<A.length; i++) {
            if (i<A.length/2) L[i] = A[i];
            else R[i-A.length/2] = A[i];
        }

        // we apply mergesort(recursively) / sort these
        // two subarrays
        L = mergeSort(L);
        R = mergeSort(R);
        // once L and R are sorted, we are ready to merge them back     // into A
        return merge(L,R);
    }

    public static int[] merge(int[] L, int[] R) {
        // we create a new array of the combined length of arrays L     // and R
        int[] result= new int[L.length+R.length];
        int iterL= 0;
        int iterR= 0;

        for(int i=0; i < result.length; i++) {
            if (iterL < L.length && (iterR >= R.length || L[iterL] < R[iterR])) {
                result[i] = L[iterL];
                iterL++;
            } else if (iterR < R.length && (iterL >= L.length || R[iterR] < L[iterL])) {
                result[i] = R[iterR];
                iterR++;
            }
        }

        return result;

    }
}
