//pattern 11
// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1
package pattern;
import java.util.*;
public class pattern11{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=0;
        System.out.println("enter the size of the rows:");
        n=sc.nextInt();

        
        for (int i = 1; i <=n; i++) {
            int count=0;
            for (int j = 1; j <=i; j++) {


                if(i%2==0){
                    
                    if(count%2!=0)
                    {
                     System.out.print("1 ");
                     count++;
                    }
                    else{
                     System.out.print("0 ");
                     count++;
                    }
                }
                else{
                    
                    if(count%2!=0)
                    {
                     System.out.print("0 ");
                     count++;
                    }
                    else{
                     System.out.print("1 ");
                     count++;
                    }
                }
               
            }
            System.out.println(" ");
        }
        sc.close();
    }
} 