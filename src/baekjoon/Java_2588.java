package baekjoon;

import java.util.Scanner;

public class Java_2588 {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num1 = number.nextInt();
        int num2 = number.nextInt();


        System.out.println(num1 * (num2 % 10));
        System.out.println(num1 * ((num2 / 10) % 10));
        System.out.println(num1 * ((num2 / 100) % 10));
        System.out.println(num1 * num2);
    }
}
