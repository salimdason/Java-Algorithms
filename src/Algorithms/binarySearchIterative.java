package Algorithms;

public class binarySearchIterative {
    public static boolean binarySearch(int [] array, int x) {
        int left =0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + ((right- left) / 2); //To prevent integer overflow
            if (array [mid] == x) {
                return true;
            } else if (x < array[mid]) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        return false;

    }
}
