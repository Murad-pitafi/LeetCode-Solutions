public class Sorting2Darr {
    static public int[][] sort(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr.length - j - 1; k++) {
                    if (arr[i][k] > arr[i][k + 1]) {
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                    }
                }
            }
        }
    return arr;
    }
    public static void main(String[] args) {
        int [][]arr = { {1, 4},
                        {6, 2}
                                };
    sort(arr);
        for ( int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
