package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //напишите тут ваш код
    private String name;
    private int age;
    private String sex;

    public Friend(String name)
    {
        this.name = name;
    }

    public Friend(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Friend(String name, String sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}