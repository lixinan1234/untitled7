package com.lianxiti.text6case2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/12 15:29
 */
public class Demo1 {
    public static void main(String[] args) {
       /*
            有一个抽奖池,该抽奖池中存放了奖励的金额,该抽奖池中的奖项为 {10,5,20,50,100,200,500,800,2,80,300,700};
            创建两个抽奖箱(线程)设置线程名称分别为“抽奖箱1”，“抽奖箱2”
            随机从抽奖池中获取奖项元素并打印在控制台上,格式如下:
            每次抽的过程中，不打印，抽完时一次性打印(随机)    在此次抽奖过程中，抽奖箱1总共产生了6个奖项。
                分别为：10,20,100,500,2,300最高奖项为300元，总计额为932元
            在此次抽奖过程中，抽奖箱2总共产生了6个奖项。
                分别为：5,50,200,800,80,700最高奖项为800元，总计额为1835元
        */


        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);


        MyThread m1 = new MyThread(list);
        MyThread m2 = new MyThread(list);
        MyThread m3 = new MyThread(list);
        MyThread m4 = new MyThread(list);
        MyThread m5 = new MyThread(list);

        m1.setName("抽奖箱1");
        m2.setName("抽奖箱2");
        m3.setName("抽奖箱3");
        m4.setName("抽奖箱4");
        m5.setName("抽奖箱5");

        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();

    }
}