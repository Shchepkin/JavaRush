package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {
    }

    public boolean fight(Cat anotherCat)
    {
        int resultAge = this.age - anotherCat.age;
        int resultWeight = this.weight - anotherCat.weight;
        int resultStrength = this.strength - anotherCat.strength;
        int counter = 0;
        if (resultAge > 0) counter++;
        if (resultWeight > 0) counter++;
        if (resultStrength > 0) counter++;
        return counter >=2 ;
    }
}
