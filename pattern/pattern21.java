// pattern 21
// *****
// *   *
// *   *
// *   *
// *****
package pattern;
import java.util.*;
public class pattern21{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=0;
        System.out.println("enter the size of the rows:");
        n=sc.nextInt();
        //for top pattern

        for (int i = 1; i <=n; i++) 
        {
              for (int j = 1; j <=n; j++) 
            {
                if(i==1||i==n)
                {
                    System.out.print("*");
                }
                else {
                    if(j==1||j==n){
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        sc.close();
    }
} 