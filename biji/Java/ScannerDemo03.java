package com.cold02;

import java.util.Scanner;

/**
 *
 * 比较数字的大小
 */
public class ScannerDemo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int one = scanner.nextInt();
        System.out.println("请输入第二个数");
        int two = scanner.nextInt();
        System.out.println("请输入第三个数");
        int thr = scanner.nextInt();
        //temp接收第一个和第二数 然后进行比较。
        int temp = (one>two)?one:two;
        //max 接收第三个数和第一个和第二个数中最大的数，进行比较
        int max = (temp>thr)?temp:thr;
        System.out.println("最大的数是："+max);
    }
}
