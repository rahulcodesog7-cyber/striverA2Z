//actual code for pattern7
//     *
//    ***
//   *****
//  *******
// *********

package pattern;
import java.util.*;
public class betterPattern7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row=0;
        System.out.println("enter the size of the rows:");
        row=sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int k = 0; k <row-i-1 ; k++) {
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
