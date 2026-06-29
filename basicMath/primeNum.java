import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        boolean isPrime=true;
        n=sc.nextInt();
        for (int i = 2; i*i<=n; i++) {
            if (n%i==0) {
                isPrime=false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("the number is prime.");
        }
        else{
            System.out.println("the number is not prime");
        }
        sc.close();
    }
}
