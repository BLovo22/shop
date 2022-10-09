package com.cold;

/**
 *
 *  % : 用于获取两个数据相除的时候的余数
 *  / : 用于获取两个数据相除的商
 */
public class Operator3 {
    public static void main(String[] args) {
        //定义两个变量
        //数据类型 变量名 = 初始化值；
        int a = 3;
        int b = 5;
        int c = 8;
        System.out.println(b/a);
        System.out.println(b%a);
        System.out.println(c%b);
        System.out.println(b%c);
    }
}
