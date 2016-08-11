package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код

        Human grandpa1 = new Human("Grandpa1", true, 66, null, null);
        Human grandpa2 = new Human("Grandpa2", true, 68, null, null);
        Human grandma1 = new Human("Grandma1", false, 62, null, null);
        Human grandma2 = new Human("Grandma2", false, 62, null, null);
        Human father = new Human("Fath", true, 35, grandpa1, grandma1);
        Human mother = new Human("Mom", false, 32, grandpa2, grandma2);
        Human child1 = new Human("child1", false, 4, father, mother);
        Human child2 = new Human("child2", true, 3, father, mother);
        Human child3 = new Human("child3", false, 2, father, mother);

        System.out.println(grandpa1.toString());
        System.out.println(grandpa2.toString());
        System.out.println(grandma1.toString());
        System.out.println(grandma2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father, mother;

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
