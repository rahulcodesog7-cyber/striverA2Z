public class recursiveBubbleSort {
    static void sort(int arr[],int i,int n){
        if(i==arr.length-1){
            return;
        }
        for (int j = 1; j < arr.length; j++) {
            if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
        }
        sort(arr, i+1, n);
    }
    public static void main(String[] args) {
        int[] arr={69,96,67,76,88,88,7};
        sort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
