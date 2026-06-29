import java.util.Scanner;

public class names {
    public static void printName(int n){
        if (n==0) {
            return;
        }
        System.out.println("Rahul");
        printName(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        n=sc.nextInt();
        printName(n);
        sc.close();
    }
}
