package baekjoon.p02556;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    private static String solve(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(repeat("*", n));
            sb.append("\n");
        }

        return sb.toString();
    }

    private static String repeat(String str, int cnt) {
        StringBuilder sb = new StringBuilder();
        while (cnt-- > 0) {
            sb.append(str);
        }

        return sb.toString();
    }

}