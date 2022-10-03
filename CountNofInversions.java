public class CountNofInversions {
    public static int NofInversions(int arr[]) {
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                n++;
            }
            arr[j + 1] = key;
        }
        return n;
    }

    public static void main(String[] args) {
        int [] arr = {2, 1, 3, 1, 2};
        System.out.println(NofInversions(arr));
    }
}
