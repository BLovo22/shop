package com.cold;

/**
 *
 * 强制转换
 *     目标类型  变量名 = （目标类型）（被转换的数据）
 *     建议数据做运算的时候，结果是什么类型就用什么类型，不要随意转换类型，因为随意转换会出现精度丢失的情况
 *
 */

public class TypeChange2 {
    public static void main(String[] args) {
        //定义两个变量
        int a = 10;
        byte b =20;

        int c =a+b;
        System.out.println(c);

        byte d = (byte) (a+b);
        System.out.println(d);
    }
}
