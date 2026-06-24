// pattern 20
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *

package pattern;
import java.util.*;
public class pattern20{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=0;
        System.out.println("enter the size of the rows:");
        n=sc.nextInt();
        //for top pattern

        for (int i = 1; i <=n; i++) 
        {
            
            for (int j = 1; j <=n; j++)
            {
                if(j<=i)
                {
                 System.out.print("*");
                }
                else System.out.print(" ");
            }
            for (int k = n; k >=1; k--)
            {
                if(k<=i)
                {
                 System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println(" ");
        }

        //bottom pattern
        for (int i = n-1; i >=1; i--) {
            
            for (int j = 1; j <=n; j++)
            {
                if(j<=i)
                {
                 System.out.print("*");
                }
                else System.out.print(" ");
            }
            for (int k = n; k >=1; k--)
            {
                if(k<=i)
                {
                 System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
} 