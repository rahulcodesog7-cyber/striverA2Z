 
public class whileloop{
    public static void main(String args[]){
       
        int high=50,sum=0;
        while(high>0){
            sum+=high;
            high--;
        }
        System.out.print("sum:"+sum);
    }
}