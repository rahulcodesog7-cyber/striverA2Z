//pattern 16
// A
// BB
// CCC
// DDDD
// EEEEE
package pattern;
import java.util.*;
public class pattern16{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=0;
        System.out.println("enter the size of the rows:");
        n=sc.nextInt();
        
        char ch='A';
        for (int i = 1; i <=n; i++) {
            
            for (int j = 1; j <=i; j++)
            {
                System.out.print(ch);
            }
            System.out.println("");
            ch++;

        }
        sc.close();
    }
} 