import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0,count=0;
        a=sc.nextInt();
        b=sc.nextInt();
        
        for (int i = 1; i <=Math.min(a, b) ; i++) {
            if(a%i==0 && b%i==0){
                count=i;
            }
        }
        System.out.println("the gcd is:"+count);
        sc.close();
    }
}
