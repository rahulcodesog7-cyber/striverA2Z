import java.util.Scanner;

public class sumOfN {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=0;
        n=sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }
}