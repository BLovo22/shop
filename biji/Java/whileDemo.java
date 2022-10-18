package com.cold04;

/**
 *
 *
 * while(判断循环条件语句){
 *     循环语句
 * }
 */
public class whileDemo {
    public static void main(String[] args) {
        int a = 1;
        while (a<=10){
            System.out.println("HelloWorld"+a);
            a++;
        }
        System.out.println("-----------------------");
        int b = 0;
        int c = 1;
        while (c<=100){
            b=b+c;
            c++;

        }
        System.out.println("1-100之间的和是"+b);
    }
}
