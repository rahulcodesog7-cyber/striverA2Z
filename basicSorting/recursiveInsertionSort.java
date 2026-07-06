public class recursiveInsertionSort {
    static void sort(int arr[],int i,int n){
        if(i==n){
            return;
        }
        int key=arr[i];
        int j=i-1;
        while (j>=0&&arr[j]>key) {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
        sort(arr, i+1, n);
    }
    public static void main(String[] args) {
        int[] arr={67,76,69,96,88,88,7};
        sort(arr,1,arr.length);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
