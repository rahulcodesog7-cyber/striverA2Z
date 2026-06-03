// Complete the function printNumber which takes an integer input from the user and prints it on the screen.

import java.util.*;
public class inputOutput{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("enter the number:");
        n=sc.nextInt();
        System.out.println(n);
        sc.close();
    }
}