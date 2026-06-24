//pattern 14
// A
// AB
// ABC
// ABCD
// ABCDE
package pattern;
import java.util.*;
public class pattern14{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=0;
        System.out.println("enter the size of the rows:");
        n=sc.nextInt();
        
        
        for (int i = 1; i <=n; i++) {
            char ch='A';
            for (int j = 1; j <=i; j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
            
        }
        sc.close();
    }
} 