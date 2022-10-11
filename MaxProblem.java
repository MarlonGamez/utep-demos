public class MaxProblem {
    public static void main(String[] args) {
        int[] arr = {-4, -7, -10, -12, -2};
        String[] arr2 = {"ddddd", "aaa", "bbbb", "cc"};
        int[][] arr3 = {
            {1, 2, 4},
            {5, 5, 5, 5, 5, 5},
            {2, 2},
            {3, 3, 3}
        };

        System.out.println();
    }

    public static int maxInt(int[] arr) {
        // create some initial max
        int max = arr[0];

        // loop over elements
        for (int i = 0; i < arr.length; i++) {
            // if we find something greater than max, then update max
            if (max < arr[i]) {
                // update max
                max = arr[i];
            }
        }

        // return max
        return max;
    }

    public static int maxStringLen(String[] arr) {
        // initial max
        int max = arr[0].length();

        for (int i = 0; i < arr.length; i++) {
            // if we find something greater than max, then update max
            if (max < arr[i].length()) {
                // update max
                max = arr[i].length();
            }
        }

        // return max
        return max;
    }

    public static int maxRowLen(int[][] arr) {
        // initial max
        int max = arr[0].length;

        for (int i = 0; i < arr.length; i++) {
            // if we find something greater than max, then update max
            if (max < arr[i].length) {
                // update max
                max = arr[i].length;
            }
        }

        // return max
        return max;
    }


    // racecar madam anna
    public static boolean mystery(String str) {
        // base case
        if (str.length() <= 1) return true;
        if (str.charAt(0) != str.charAt(str.length()-1)) return false;

        return mystery(str.substring(1, str.length()-1));
    }


}