package com.lianxi1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/22 21:11
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*
               为了保证文件的安全性，就需要对原始文件进行加密存储，再使用的时候再对其进行解密处理。
               加密原理：
                     对原始文件中的每一个字节数据进行更改，然后将更改以后的数据存储到新的文件中
               解密原理：
                     读取加密之后的文件，按照加密的规则反向操作，变成原始文件
         */

        //1.创建对象关联原始数据
        FileInputStream fis = new FileInputStream("C:\\Users\\李新安\\Desktop\\Java代码\\engy.jpg");
        //2.创建对象关联加密文件
        FileOutputStream fos = new FileOutputStream("C:\\Users\\李新安\\Desktop\\Java代码\\xin.jpg");
        //3.加密处理
        int b;
        while ((b = fis.read())!=-1){
            fos.write(b ^ 10);
        }
        //4.释放资源
        fos.close();
        fis.close();
    }
}
