package codingtest;

import java.util.Scanner;

public class Java_2525 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        int totalTime = h * 60 + m + t;

        if(totalTime >= 24*60) {
            totalTime = totalTime - 24*60;
            System.out.println(totalTime / 60 + " "+ totalTime % 60);
        } else {
            System.out.println(totalTime / 60 + " " + totalTime % 60);
        }
    }
}
