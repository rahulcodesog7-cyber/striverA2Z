import java.util.Scanner;

public class numDescending {
    public static void printN(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        printN(n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=0;
        n=sc.nextInt();
        printN(n);
        sc.close();
    }
}
