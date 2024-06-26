package com.Regex;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/9 14:01
 */
public class Regex4lianxi {
    public static void main(String[] args) {
        //正则表达式练习：
        //请编写正则表达式验证用户名是否满足要求
        //要求：大小写字母，数字，下划线一共4——16位。
        String str = "\\w{4,16}";
        System.out.println("_ZeGe223".matches(str));
        System.out.println("-------------------------------");





        //请编写正则表达式验证身份证号码是否满足要求
        //简单要求：18位，前17位任意数字，最后一位可以是数字可以是大写的X或者是小写的x。
        String str1 = "[1-9]\\d{16}[\\dXx]";
        //(?i)忽略大小写
        String str2 = "[1-9]\\d{16}(\\d|(?i)x)";
        System.out.println("362323200207182114".matches(str1));
        System.out.println("362323200207182114".matches(str2));
        System.out.println("-------------------------------");




        //复杂要求：按照身份证号码的格式严格要求。
        //362323200207182114
        //前6位：省份，市区，派出所等信息，第一位不能为0，后面5位是任意数字。[1~9]\\d{5}
        //年前半段： 18 19 20       (18|19|20)
        //年后半段： 任意数字出现两次   \\d{2}
        //月份： 01~09 10 11 12     0[1~9]|1[0~2]
        //日期： 01~31              1[1~9]|2[1~9]|3[0~1]
        //后面四位： 任意数字出现3次，最后一位可以是数字也可以是大写的X或者是小写的x  \\d{3}(\\d|(?i)x)

        String str4 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|1[1-9]|2[1-9]|3[01])\\d{3}[\\d|(?i)x]";
        if("362323200207182114".matches(str4)==true){
            System.out.println("身份证号码正确");
        }else{
            System.out.println("身份证号码错误");
        }


    }
}
