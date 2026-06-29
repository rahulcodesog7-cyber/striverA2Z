import java.util.Scanner;

public class numReverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=0,rem=0,rev=0;
        n=sc.nextInt();
        while (n!=0) {
            rem=n%10;
            n=n/10;
            rev=rev*10+(rem);
        }
        System.out.println("reversed:"+rev);
        sc.close();
    }    
}
