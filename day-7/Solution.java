import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        int q = scn.nextInt();
        for (int i = 0; i < q; i++) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int n = scn.nextInt();
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum = sum + (int) Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
