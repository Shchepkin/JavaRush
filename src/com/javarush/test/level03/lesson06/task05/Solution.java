package com.javarush.test.level03.lesson06.task05;

/* Изучаем японский
Выведи на экран 日本語
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println("日本語");
        boolean truthy = true;
        boolean falsey = false;
        System.out.println("truthy = " + truthy);
        System.out.println("falsey = " + falsey);
        truthy = Boolean.FALSE;
        falsey = Boolean.TRUE;
        System.out.println("truthy = " + truthy);
        System.out.println("falsey = " + falsey);
        int i = 2000000000;
        int j = 2000000000;
        int f = i+j;
        System.out.println(i + j);
        System.out.println(f);

    }
}