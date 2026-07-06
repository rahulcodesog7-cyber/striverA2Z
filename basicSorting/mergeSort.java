public class mergeSort {
    static void sort(int arr[],int start,int end){
        if(start<end){
            int mid=start+(end-start)/2;
            sort(arr, start, mid);
            sort(arr, mid+1, end);
            merge(arr,start,mid,end);
        }
    }
    static void merge(int arr[],int start,int mid,int end){
        int n1=mid-start+1;
        int n2=end-mid;
        int larr[]=new int[n1];
        int rarr[]=new int[n2];
        for (int i = 0; i < n1; i++) {
            larr[i]=arr[start+i];
        }
        for (int i = 0; i < rarr.length; i++) {
            rarr[i]=arr[mid+i+1];
        }
        int i=0;
        int j=0;
        int k=start;
        while(i<n1 && j<n2 ){
            if(larr[i]<rarr[j]){
                arr[k]=larr[i];
                i++;
            }else{
                arr[k]=rarr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=larr[i];
            i++;
            k++;
        }
        while (j<n2) {
            arr[k]=rarr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,1,4,2,3};
        sort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
