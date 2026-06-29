import java.util.Scanner;

public class printing {
    public static void printN(int n){
        if (n==0) {
            return;
        }
       System.out.println("text");
       printN(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        printN(10);
        sc.close();
    }
}
