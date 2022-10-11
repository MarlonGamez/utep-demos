public class Quicksort {
    public static int partition(int[] A, int start, int end) {
        int pivot = A[start];

        int less = start+ 1;
        int more = end;
        int aux;

        while(less < more) {
            while(less < end+1 && A[less] <= pivot) less++;
            while (more > start && A[more] > pivot) more--;

            if(less < more) {
                aux= A[less];
                A[less] = A[more];
                A[more] = aux;
            }

        }

        if(A[more] <= pivot) {
            aux= A[more];
            A[more] = pivot;
            A[start] = aux;
            return more;
        }
        return start;
    }
}
