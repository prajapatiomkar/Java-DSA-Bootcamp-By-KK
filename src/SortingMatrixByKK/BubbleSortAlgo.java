package SortingMatrixByKK;

import java.util.Arrays;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 7, 8, 5};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort(int[] arr) {
        Boolean swapped=false;

        for (int i=0;i< arr.length;i++){
            for (int j=1;j<arr.length-1;j++){

                if (arr[j] <arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;


                }
            }

            if (!swapped){
                break;
            }
        }


    }
}
