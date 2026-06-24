//pattern 8

// *********
//  *******
//   *****
//    ***
//     *
package pattern;
import java.util.*;
public class pattern8{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=0;
        System.out.println("enter the size of the rows:");
        n=sc.nextInt();
        for (int i = n; i >0; i--) {
            for (int k =0; k <n-i ; k++) {
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