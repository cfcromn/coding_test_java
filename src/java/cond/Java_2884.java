package java.cond;

import java.util.Scanner;

public class Java_2884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int m = sc.nextInt();
        int time = t * 60 + m - 45;

        if (t <24 && m < 60) {
            if (time < 0) {
                time += 24 * 60;
            }
            System.out.println(time/60 + " " + time % 60);
        }
    }
}
