package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Input name: ");

//        System.out.print("Input years: ");
        String stringYear = reader.readLine();
        int numYear = Integer.parseInt(stringYear);
        String name = reader.readLine();
        System.out.println(name + " захватит мир через " + numYear + " лет. Му-ха-ха!");
//        System.out.println(name + " захватит мир через " + stringYear + " лет. Му-ха-ха!");
    }
}