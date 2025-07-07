package cond;

import java.util.Scanner;

public class Java_2480 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        if (first == second && first == third) {
            System.out.println(10000 + first * 1000);
        } else if (first != second && first != third && second != third) {
            System.out.println(((first > second)? (first > third)? first:third : (second > third)? second:third) * 100);
        } else if (first != second && second == third || first == second && second != third || first != second && first == third) {
            if (second == third) {
                System.out.println(second * 100 + 1000);
            } else if (first == third) {
                System.out.println(first * 100 + 1000);
            } else if (second == first) {
                System.out.println(second * 100 + 1000);
            }
        }
    }
}
