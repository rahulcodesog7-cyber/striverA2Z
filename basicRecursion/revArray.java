//program to reverse an array using recursion
import java.util.Scanner;
public class revArray {
    static void rev(int start,int end, int[] arr){
        if(start>=end){
            return;
        }
        int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        rev(start+1, end-1, arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int end=0,start=0;
        int[] arr=new int[5];
        end=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        rev(start,end,arr);
        for (int j = 0; j< arr.length; j++) {
            System.out.print(" "+arr[j]);    
        }
        
        sc.close();
    }
}
