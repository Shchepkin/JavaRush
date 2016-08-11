package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man man1 = new Man("Vasya", 23, "Lomonosova str., 34, flat 15");
        Man man2 = new Man("Tolik", 28, "Lenina str., 43, flat 45");
        Woman woman1 = new Woman("Tanya", 14, "Solnechnaya str., 34, flat 15");
        Woman woman2 = new Woman("Masha", 22, "Koroleva str., 43, flat 45");

        //выведи их на экран тут
    }

    //добавьте тут ваши классы
    public static class Man{
        public String name;
        public int age;
        public String address;



        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
            System.out.println(name + " " + age + " " + address);
        }
    }

    public static class Woman{
        public String name;
        public int age;
        public String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
            System.out.println(name + " " + age + " " + address);
        }
    }

}
