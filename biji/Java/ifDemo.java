package com.cold;

/**
 *
 * 1.首先计算关系表达式结构，看看是true还是false
 * 2.如果是true就执行语句体
 * 3.如果是false就不执行
 *
 *
 */
public class ifDemo {

    public static void main(String[] args) {
        System.out.println("开始执行");
        //定义两个变量
        int a = 22;
        int b = 23;
        if(a==b){
            System.out.println("结果为true执行了语句体");
        }
        System.out.println("结束");
    }
}
