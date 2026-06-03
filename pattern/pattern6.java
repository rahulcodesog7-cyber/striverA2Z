//pattern6
// 12345
// 1234
// 123
// 12
// 1


// import java.util.*;
// public class pattern6{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         int row=0;
//         System.out.println("enter the number of rows:");
//         row=sc.nextInt();
//         for(int i=0;i<row;i++){
//             for(int j=row,k=1;j>i && k<=row;j--,k++){
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

//optimal solution for the pattern
package pattern;
import java.util.*;
public class pattern6{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int row=0;
        System.out.println("enter the number of rows:");
        row=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=1;j<=row-i ;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}