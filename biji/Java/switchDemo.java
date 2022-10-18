package com.cold02;


/**
 * switch(){
 *     case1:
 *     语句
 *     break;
 *     case2:
 *      语句
 *      break;
 *      default:
 *      语句
 *      break;
 * }
 *
 *
 */

import java.util.Scanner;

public class switchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1-7的数字：");

        int num = sc.nextInt();

        switch (num){
            case 1:
                System.out.println("星期一");
            break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("你勾八能不能不要乱输？");
                break;
        }
    }
}
