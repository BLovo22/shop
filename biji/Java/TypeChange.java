package com.cold;


/**
 * 是一个运算符号，用于程序中做加法运算
 *   我们在运算的时候  一般的都是要求运算的参数，数据类型要是一致的。
 *
 *   类型转换
 *   1。隐式转换
 *   2.强制转换
 *
 *
 *   byte short char  ======> int   ======>long   ========>float =====>double
 *
 *
 *
 *
 */
public class TypeChange {
    public static void main(String[] args) {
        //定义两个变量
        //数据类型 变量名 = 初始化值


        int a =10;
        int b =20;

        int c = a + b;
        System.out.println(c);

        //定义一个byte类型的，在定义一个int类型的变量
        byte e =25 ;
        int d = 44;
        System.out.println(e+d);

        int f = e+d;
        System.out.println(f);

        //如果直接输出打印的话的是可以的，但是我们要定义接收的变量的话，使用byte是没法接收的
    }
}
