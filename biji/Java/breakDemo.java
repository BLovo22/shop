package com.cold06;

public class breakDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i==3){
                System.out.println("第三个是我哥们不用检查。");
                //continue 跳过某一次循环的
                continue;
            }
            if(i == 7){
                System.out.println("到第七个就以后就不用检查了。");
                //到这里终止循环
                break;
            }
            System.out.println("HelloWorld"+i);
        }
    }
}
