// Given two integers low and high, return the sum of all integers from low to high inclusive.
import java.util.*;
public class forloop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int high=0,low=0,sum=0;
        System.out.println("enter the high and low");
        System.out.print("High:");
        high=sc.nextInt();
        System.out.print("low:");
        low=sc.nextInt();
        for(;low<=high;low++){
            sum+=low;
        }
        System.out.print("sum:"+sum);
    }
}