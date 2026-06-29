import java.util.*;
public class countDigit {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=0;
        n=sc.nextInt();
        int count=0;
        while (n!=0) {
            n=n/10;
            count++;
        }
        System.out.println("there are "+count+" number of digits in "+n);
        sc.close();
    }
}