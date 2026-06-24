//pattern 10
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
package pattern;
import java.util.*;
public class pattern10{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=0;
        System.out.println("enter the size of the rows:");
        n=sc.nextInt();

        //top half
        for (int i = 1; i <=n; i++) {
            
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        

        //bottom half
        for (int i = n-1; i >=1; i--) {
            
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


        sc.close();
    }
} 