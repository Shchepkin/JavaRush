package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("input number : ");
        String strNum = reader.readLine();
        int num = Integer.parseInt(strNum);
        if (num > 0) System.out.println(num*2);
        else System.out.println(num + 1);

    }

}