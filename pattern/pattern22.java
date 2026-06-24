// pattern 22
// 5 5 5 5 5 5 5 5 5 
// 5 4 4 4 4 4 4 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 2 1 2 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 4 4 4 4 4 4 5 
// 5 5 5 5 5 5 5 5 5
package pattern;
import java.util.*;

public class pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size (n):");
        int n = sc.nextInt();

        // The grid size is (2n-1) x (2n-1)
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                
                // Calculate distances from all 4 edges
                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;
                
                // The value is determined by the minimum distance to any edge
                int minDistance = Math.min(Math.min(top, bottom), Math.min(left, right));
                
                System.out.print((n - minDistance) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}