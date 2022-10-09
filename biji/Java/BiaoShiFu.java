package com.cold.controller;

/**
 * 标识符  是用来定义 包 类 方法 变量 起名用的
 *
 *
 *      组成范围
 *      1.数字  英文的大小写  汉字（不要用汉字）
 *      2.下划线_
 *      3.美元 $
 *
 *      注意事项
 *      1.不能是数字开头
 *      2、不能是java的关键字
 *
 *
 *
 *
 *
 *
 *
 */

/**
 * 常见的命名规则
 *  1.基本要求 见名识意
 *  2.常见的命名
 *
 *  1.包（其实就是文件夹 方便我们管理）
 *  全部小写 多个级别的话 就用.隔开
 *  2.类
 *  一个单词的话 首字母大写
 *  Hello
 *  多个单词的话 每一个单词的首字母大写
 *  Hello World
 *  3.方法和变量
 *  一个单词的时候 首字母小写
 *  main name
 *  多个单词的时候 从第二个单词开始 每个单词的首字母都要大写
 *  helloWorld   isDelete
 *
 *
 *
 *
 */
public class BiaoShiFu {


    public static void main(String[] args) {


        int a = 10;
        System.out.println("这是一个数字十" + 10);
        System.out.println("这是一个变量啊" +"也是变量" +  a);
    }
}
