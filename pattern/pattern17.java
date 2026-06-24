//pattern 17
//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA
package pattern;
import java.util.*;

public class pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the rows:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // 1. Spaces
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }

            // 2. Ascending part ('A' to peak)
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            // 3. Descending part (peak-1 back to 'A')
            ch -= 2; // Move back from the character after peak to peak-1
            for (int j = 1; j < i; j++) {
                System.out.print(ch);
                ch--;
            }

            System.out.println();
        }
        sc.close();
    }
}