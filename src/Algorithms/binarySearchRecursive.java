package Algorithms;



public class binarySearchRecursive {
    public static boolean binarySearch(int [] array, int x, int left, int right) {
        if (left > right) {
            return false;
        }

        int mid = left + ((right- left) / 2); //To prevent integer overflow in java
        if (array [mid] == x) {
            return true;
        } else if (x < array[mid]) {
            return binarySearch(array, x, left, mid -1);
        } else {
            return binarySearch(array, x, mid +1, right);
        }
    }
}
