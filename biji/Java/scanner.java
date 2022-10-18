package com.cold;

import java.util.Scanner;

/**
 *
 *
 * scanner
 * 如何使用scanner
 * 1.导包
 * import java.util.Scanner;
 * 2.创建对象
 * Scanner scanner = new Scanner(System.in);
 * 3.接收数据
 * String name = scanner.nextLine();
 */
public class scanner {
    public static void main(String[] args) {
        //alt +回车
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的名字：");
        String name = scanner.nextLine();

        System.out.println("请输入身高：");
        int shenGao = scanner.nextInt();

        System.out.println("请输入年龄：");
        int age = scanner.nextInt();

        System.out.println("请输入地区：");
        String diqv = scanner.next();

        System.out.println("名字：" + name +"----身高：" +shenGao+"厘米"+"----年龄："+age+"岁-----"+"地区："+diqv);

    }
}
