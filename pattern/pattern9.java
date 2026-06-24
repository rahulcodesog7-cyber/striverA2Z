//pattern 9

//     * 
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *
package pattern;
import java.util.*;
public class pattern9{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=0;
        System.out.println("enter the size of the rows:");
        n=sc.nextInt();

        //top half
        for (int i = 1; i <=n; i++) {
            for (int k =1; k <=n-i ; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        

        //bottom half
        for (int i = n-1; i >=1; i--) {
            for (int k =1; k <=n-i ; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }


        sc.close();
    }
} 