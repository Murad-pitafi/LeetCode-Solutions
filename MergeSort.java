public class MergeSort {
    public static void mergeSort(int[] arr, int beg, int end) {

        if (beg >= end)
        {
            return;
        }

            int mid = beg + (end-beg)/2;
            mergeSort(arr, beg, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, beg, mid, end);
    }
    public static void merge(int [] arr, int str, int mid, int end)
    {
        int [] temp = new int[end-str + 1];
        int index1 = str;
        int index2 = mid+1;
        int x = 0;
        while(index1 <= mid && index2 <= end)
        {
            if (arr[index1] <= arr[index2])
            {
                temp[x++] = arr[index1++];
            }
            else {
                temp[x++] = arr[index2++];
            }
        }
        while(index2 <= end)
        {
            temp[x++] = arr[index2++];
        }
        while (index1 <= mid)
        {
            temp[x++] = arr[index1++];
        }

        for (int i = 0, j = str; i < temp.length; i++, j++)
        {
            arr[j] = temp[i];
        }

    }

    public static void main(String[] args) {
        int [] arr = {1, 3, 6, 8, 2, 5};
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
