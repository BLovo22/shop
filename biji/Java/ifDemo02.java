package com.cold;

/**
 * if(表达式){
 *     语句1
 * }else{
 *     语句2
 * }
 *1.首先先看表达式
 * 2.如果是true就执行语句1
 * 3.如果false就执行语句2
 *
 */
public class ifDemo02 {
    public static void main(String[] args) {
        System.out.println("开始");
        //定义一个变量
        int a = 22;
        //判断这是变量是奇数还是偶数
        if(a%2 == 0){
            System.out.println(a+"是偶数");
        }else {
            System.out.println(a+"是奇数");
        }
        System.out.println("结束");
    }
}
