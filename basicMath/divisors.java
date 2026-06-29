import java.util.Scanner;

public class divisors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0,i=1;
        n=sc.nextInt();
        while (i<=n) {
            if (n%i==0) {
                System.out.print(i+" ");
            }
            i++;
        }
        sc.close();
    }
}
