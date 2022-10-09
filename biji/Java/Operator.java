package com.cold;

/**
 * 运算符 就是对于常量和变量进行操作的符号
 *
 *   常用运算符
 *   算数运算符
 *   关系运算符
 *   逻辑运算符
 *   三元运算符
 *
 *   算数运算符
 *   +，-，*，/,%,++,--
 *
 *  注意事项：
 *      1.数字相除只能得到整数，想要得到小数，必须有小数（浮点类型）参与运算
 *      2.字符串参数 加法运算的话 实际上得到的是拼接效果
 *      3.字符串参与加法运算，实际上拿到的是计算机中存储的数据
 *
 */
public class Operator {

    public static void main(String[] args) {
        //定义两个变量
        //数据类型 变量名 = 初始值；
        int a = 10;
        int b = 15;
        double c = 2.3;
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/c);
        System.out.println(107-a);


        System.out.println("===============================");
        System.out.println("冰凉的分数："+a +"分");

        System.out.println("---------------------");
        System.out.println('A'+a);//A在计算机中代表的数字是65
        System.out.println('a'+a);//a在计算机中代表的数字是97


    }

}
