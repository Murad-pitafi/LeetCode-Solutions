public class Task03 {
    public static void patternArr(int []arr)
    {
        int [] temp = new int[arr.length/2];
        int [] temp1 = new int[(arr.length/2)+1];
        for (int i = 0; i <arr.length; i+=2)
        {
            temp1[i] = arr[i];
            int key = arr[i];
            int j = i -1;
            while(j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for (int i = 1; i <arr.length; i+=2)
        {
            int key = arr[i];
            int j = i -1;
            while(j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

    }

    public static void main(String[] args) {
        int []arr = {7, 10, 11, 3, 6, 9, 2, 13, 0 };
        patternArr(arr);
    }
}
