package com.haidong.common.test;

import java.util.Scanner;

public class Demo {

    public final  static double PI = 3.1415926;
    public static void main(String[] args) {

        System.out.println("Hello World!");
        Scanner scan = new Scanner(System.in);
        System.out.println("输入圆的半径:");
        //使用next方式接收
        Double r = new Double(scan.nextLine());
        Double s = PI*r*r;
        System.out.println("圆的面积为："+s);
        //及时关闭IO流的类，否则会一直占用资源
        scan.close();
    }
}
