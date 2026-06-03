// pattern1 from dsa sheet
// *****
// *****
// *****
// *****

import java.util.*;
public class pattern1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row;
        System.out.println("enter the number of rows u want:");
        row=sc.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}