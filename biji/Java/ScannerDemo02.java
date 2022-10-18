package com.cold02;

import java.util.Scanner;

/**
 *判断两个数是否相等
 */
public class ScannerDemo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int one = scanner.nextInt();
        System.out.println("请输入第二个数");
        int two = scanner.nextInt();

        boolean xiangDeng = (one == two);
        System.out.println(xiangDeng);
    }
}
