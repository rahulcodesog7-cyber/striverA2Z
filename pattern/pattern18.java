//pattern 18
// E 
// D E 
// C D E 
// B C D E 
// A B C D E
package pattern;
import java.util.*;

public class pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the rows:");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            char ch = (char)('A' + n - i);
            for (int j = 1; j <=i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}