package com.github;

import java.util.Scanner;

public class QiuHe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        int i = scanner.nextInt();
        for (int j = 0; j < i; j++) {
            if (j == j) {
                for (int k = i; k > j; k--) {
                    System.out.println(k + "+" + (i - k) + "=" + (i));
                }
            }
        }
    }
}

