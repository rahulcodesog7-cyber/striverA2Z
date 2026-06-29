import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0,rem=0,sum=0,temp=0;
        n=sc.nextInt();
        temp=n;
        while (n!=0) {
            rem=n%10;
            sum+=Math.pow(rem, 3);
            n=n/10;
        }

        if (sum==temp) {
            System.out.println("number is armstrong");
        }
        else{
            System.out.println("number is not armstrong");
        }
        sc.close();
    }
}
