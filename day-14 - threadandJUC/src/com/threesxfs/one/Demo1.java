package com.threesxfs.one;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/7 22:26
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
                多线程的第一种启动方式：
                  1.自己定义一个类继承Thread
                  2.重写run方法
                  3.创建子类对象，并启动线程
       */

        MyThread t1 =new MyThread();
        MyThread t2 =new MyThread();

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
