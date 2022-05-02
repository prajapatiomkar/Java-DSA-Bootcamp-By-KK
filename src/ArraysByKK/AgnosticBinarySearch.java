package ArraysByKK;

public class AgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {2, 4, 6, 9, 11, 15, 17, 21, 22, 28};
        int[] arr = {28,27,25,21,18,15,12,9,7,2,1};
        int target = 0;

//        if (ABS(arr, target) == -1) {
//            System.out.println(target + " is not present in the given array");
//        } else {
//            System.out.println(target + " is present at " + ABS(arr, target) + " index.");
//        }

        if (ABS1(arr, target) == -1) {
            System.out.println(target + " is not present in the given array");
        } else {
            System.out.println(target + " is present at " + ABS1(arr, target) + " index.");
        }

    }

    static int ABS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int ABS1(int[] arr, int target) {
        if (arr[0] < arr[arr.length - 1]) {
            return Ascending(arr, target);
        } else {
            return Descending(arr, target);
        }
    }
    static int Ascending(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int Descending(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
