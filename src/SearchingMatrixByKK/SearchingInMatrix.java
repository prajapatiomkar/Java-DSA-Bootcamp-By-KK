package SearchingMatrixByKK;

public class SearchingInMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 6;
//        matrixSearch(arr,target);
        matrixSearch1(arr,target);
    }
    long start = System.currentTimeMillis();
    static void matrixSearch(int[][] arr,int target){
        int n = arr.length - 1;
        boolean found = false;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (arr[r][c] == target) {
                    found = true;
                }
            }
        }
        if (found) {
            System.out.println("Answer Found");
        } else {
            System.out.println("Answer not Found");
        }
    }

    static void matrixSearch1(int[][] arr,int target){
        int r = 0;
        int c = arr.length-1;

        while (r<arr.length && c>=0){
            if (arr[r][c] == target){
                System.out.println("Answer found at row "+r+" c "+c);
            }
            if (arr[r][c] < target){
                r++;
            }else {
                c--;
            }
        }
    }

}
