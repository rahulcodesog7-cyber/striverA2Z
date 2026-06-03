//pattern4
// 1
// 22
// 333
// 4444
// 55555
package pattern;
import java.util.*;
public class pattern4{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int row=0;
        System.out.println("enter the number of rows:");
        row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}