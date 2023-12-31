public class Mountain {
    private int[] arr;
    public Mountain(int[] arr) {
        this.arr = arr;
    }
    /** @param array an array of positive integer values

     @param stop the last index to check
     Precondition: 0 <= stop < array.length
     @return true if for each j such that 0 <= j < stop, array[j] < array[j + 1] ;
     false otherwise
     */

    public static boolean isIncreasing(int[] array, int stop) {
        // To be implemented.
        if (stop >= array.length) {
            return false;
        }
        for (int i = 0; i < stop;i++) {
            if (!(array[i] < array[i+1])) {
                return false;
            }
        }
        return true;
    }
    /** @param array an array of positive integer values
     @param start the first index to check
     Precondition: 0 <= start < array.length - 1
     @return true if for each j such that start <= j < array.length - 1,
     array[j] > array[j + 1];
     false otherwise
     */

    public static boolean isDecreasing(int[] array, int start) {
        if (start < 0) {
            return false;
        }
        for (int i = array.length-1; i > start;i--) {
            if (!(array[i] < array[i-1])) {
                return false;
            }
        }
        return true;
    }

    public static int getPeakIndex(int[] array) {
        for (int i = 1; i < array.length-1;i++) {
            if (array[i-1] < array[i] && array[i+1] < array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isMountain(int[] array) {
        for (int i = 0; i < array.length;i++) {
            if (isIncreasing(array,i) && isDecreasing(array, i) && i == getPeakIndex(array)){
                return true;
            }
        }
        return false;
    }
}