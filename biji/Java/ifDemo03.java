package com.cold;

import java.util.Scanner;

/**
 * if(表达式){
 *     语句1
 * }else if(表达式){
 *     ...
 * }else(表达式){
 *     语句2
 * }
 *
 *
 */
public class ifDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入明天的温度：");
        int wenDu = sc.nextInt();

        //if判断
        if(wenDu > 29 && wenDu <=38){
            System.out.println("明天天气很热，适合穿背心。");
        } else if (wenDu > 16 && wenDu <= 29) {
            System.out.println("明天温度适宜适合穿体恤。");
        } else if (wenDu > 6 && wenDu <= 16) {
            System.out.println("明天温度偏冷记得穿外套。");
        }else {
            System.out.println("明天温度有点低，请减少出门");
        }
    }
}
