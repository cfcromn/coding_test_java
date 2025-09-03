package java1.loop;

import java.util.Scanner;

public class Java_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = sc.nextInt();
        int count = sc.nextInt();
        int sumPrice = 0;

        for (int i = 0; i < count; i++) {
            int price = sc.nextInt();
            int quantity = sc.nextInt();
            sumPrice += price * quantity;
        }
        if (sumPrice == totalPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

