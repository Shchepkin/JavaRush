package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayBig = new int[20];
        int[] arraySmall1 = new int[10];
        int[] arraySmall2 = new int[10];

        for (int i = 0; i < 20; i++)
        {
            arrayBig[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 10; i++)
        {
            arraySmall1[i] = arrayBig[i];
            arraySmall2[i] = arrayBig[i+10];
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.println(arraySmall2[i]);
        }
    }
}
