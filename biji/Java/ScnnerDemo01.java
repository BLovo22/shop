package com.cold02;

import java.util.Scanner;

/**
 *
 * 求两个数的和
 *
 */
public class ScnnerDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int one = scanner.nextInt();
        System.out.println("请输入第二个数");
        int two = scanner.nextInt();

        int he = one+two;
        System.out.println("它们的和是："+he);

    }
}
