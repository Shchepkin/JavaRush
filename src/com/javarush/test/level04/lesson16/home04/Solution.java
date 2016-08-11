package com.javarush.test.level04.lesson16.home04;

import java.io.*;
import java.util.Scanner;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int y = scan.nextInt();
        int m = scan.nextInt();
        int d = scan.nextInt();
        System.out.format("Меня зовут %s%nЯ родился %d.%d.%d", name, d, m, y);



    }
}
