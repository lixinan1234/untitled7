package com.text2;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/19 21:01
 */
public class MyReflect {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
    /*
        反射可以跟配置文件结合的方式，动态的创建对象，并调用方法
    */

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("day-16-fanshe/a.properties");
        prop.load(fis);
        fis.close();
        System.out.println(prop);


        //2.获取全类名和方法名
        String className = (String) prop.get("classname");
        String methodName = (String) prop.get("method");

        System.out.println(className);
        System.out.println(methodName);

        //3.利用反射创建对象并运行方法
        Class clazz = Class.forName(className);

        //获取构造方法
        Constructor con = clazz.getDeclaredConstructor();
        Object o = con.newInstance();
        System.out.println(o);

        //获取成员方法并运行
        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(o);

    }
}
