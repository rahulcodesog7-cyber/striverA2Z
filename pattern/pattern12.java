//pattern 12
// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321
package pattern;
import java.util.*;
public class pattern12{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=0;
        System.out.println("enter the size of the rows:");
        n=sc.nextInt();

        
        for (int i = 1; i <=n; i++) {
            
            for (int j = 1; j <=n; j++)
            {
                if(j<=i)
                {
                 System.out.print(j);
                }
                else System.out.print(" ");
            }
            for (int k = n; k >=1; k--)
            {
                if(k<=i)
                {
                 System.out.print(k);
                }
                else System.out.print(" ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
} 

