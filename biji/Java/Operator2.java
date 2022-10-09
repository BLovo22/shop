package com.cold;

/**
 *
 * ++,-- 单独使用的时候，无论是++，--,放在变量的前面或者后面都可以使用
 * ++，-- 参与运算操作的时候
 *      如果++，-- 在变量的后面的时候就会先拿到变量再进行运算
 *      如果++，-- 在变量的前面的时候就会先运算再拿变量
 *
 *
 */
public class Operator2 {


    public static void main(String[] args) {
        //定义一个变量
        int a =10;
        System.out.println(a);

        //a++;
        //a--;
//        System.out.println(a);
        System.out.println("--------++，-- 参与运算使用---------");
        int b = ++a;
        int c = a++;
        System.out.println(b);
        System.out.println(c);
    }
}
