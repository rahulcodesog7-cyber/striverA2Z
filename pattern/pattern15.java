//pattern 15
// ABCDE
// ABCD
// ABC
// AB
// A
package pattern;
import java.util.*;
public class pattern15{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=0;
        System.out.println("enter the size of the rows:");
        n=sc.nextInt();
        
        
        for (int i = n; i >=1; i--) {
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