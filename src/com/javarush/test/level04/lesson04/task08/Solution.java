package com.javarush.test.level04.lesson04.task08;

/* Треугольник
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/

import java.io.*;

public class Solution
{
    private static String YES_TRIANGLE = "Треугольник существует.";
    private static String NO_TRIANGLE = "Треугольник не существует.";

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[3];
        for (int i=0; i<3; i++){
//            System.out.print("input num : ");
            String strNum = reader.readLine();
            num[i] = Integer.parseInt(strNum);
        }
        if ((num[0] + num[1] > num [2]) && (num[1] + num[2] > num [0]) && (num[2] + num[0] > num [1]) )
            System.out.println(YES_TRIANGLE);
        else System.out.println(NO_TRIANGLE);
    }
}