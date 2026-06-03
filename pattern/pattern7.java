//pattern7
//     *
//    ***
//   *****
//  *******
// *********
package pattern;
import java.util.*;
public class pattern7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=0;
        System.out.println("enter the number of rows:");
        row=sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int k = 0; k <row-i-1 ; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
//this will print
//     *
//    * *
//   * * *
//  * * * *
// * * * * *