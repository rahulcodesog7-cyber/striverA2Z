//program to print array's element using functions

import java.util.*;
public class functionbyvalue{
    public static void display(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=0;
        System.out.println("enter the size of array:");
        n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        display(arr,5);
        sc.close();
    }
}