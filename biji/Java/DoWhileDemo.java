package com.cold05;

/**
 * 1.执行初始化语句
 * 2.执行循环语句
 * 3.执行控制语句
 * 4.不管最后的条件是true还是false都会至少执行一边
 *
 *
 * do{
 *
 * }while(判断条件语句)
 *
 *
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        //for循环
        for (int i = 1;i >10;i++){
            System.out.println("HelloWorld" + i);
        }
        System.out.println("---------------------");
        //do while 循环
        int i = 1;
        do {
            System.out.println("HelloWorld"+i);
            i++;
        }while (i>10);
    }
}
