package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[4];
        int out = 0;
        for (int i = 0; i < 4; i++)
        {
            String strNum = reader.readLine();
            num[i] = Integer.parseInt(strNum);
            if (i != 0)
            {
                if (num[i] >= out) out = num[i];
            }
            else out = num[i];
        }
        System.out.println(out);
    }
}
