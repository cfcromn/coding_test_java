package codingtest;

import java.util.Scanner;

public class Java_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n / 4;

        if (n >= 4) {
            for (int i = 0; i < count; i++) {
                System.out.print("long ");
            }
        }
        System.out.println("int");
    }
}
