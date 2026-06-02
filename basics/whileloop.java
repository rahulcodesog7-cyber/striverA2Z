import java.util.*;
public class whileloop{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int high=50,sum=0;
        while(high>0){
            sum+=high;
            high--;
        }
        System.out.print("sum:"+sum);
    }
}