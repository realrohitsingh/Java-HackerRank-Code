import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("================================");
        while (scn.hasNext()) {
            String s = scn.next();
            int x = scn.nextInt();
            System.out.printf("%-15s%03d%n", s, x);
        }
        System.out.println("================================");
    }
}
