public class BubbleSorting {
    public static int[] bubbleSort(int []arr)
    {
        for (int i = 0; i < arr.length -1; i++)
        {
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 4, 2};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
