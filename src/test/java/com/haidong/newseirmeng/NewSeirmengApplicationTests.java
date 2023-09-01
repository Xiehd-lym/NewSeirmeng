package com.haidong.newseirmeng;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Scanner;

@SpringBootTest
class NewSeirmengApplicationTests {

    @Test
    void contextLoads() {

        System.out.println("Hello World!");


        String mianji = null;
        Scanner scan = new Scanner(System.in);
        System.out.println(System.getProperty("输入圆的半径r\\n"));
        //使用next方式接收
        String str = scan.nextLine();

        System.out.println("输出的内容为："+str);

        //及时关闭IO流的类，否则会一直占用资源
        scan.close();


    }

}
