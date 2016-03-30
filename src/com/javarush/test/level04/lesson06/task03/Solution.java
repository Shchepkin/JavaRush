package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer[] num = new Integer[3];
        for (int i = 0; i < 3; i++)
        {
            String strNum = reader.readLine();
            num[i] = Integer.parseInt(strNum);
        }
        Arrays.sort(num, Collections.reverseOrder());

        for(int i = 0; i <  3; i++)
            System.out.println(num[i]);
    }
}
