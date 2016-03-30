package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Zerg zerg6 = new Zerg();
        Zerg zerg7 = new Zerg();
        Zerg zerg8 = new Zerg();
        Zerg zerg9 = new Zerg();
        Zerg zerg10 = new Zerg();
        zerg1.name = "Zerk number 1";
        zerg2.name = "Zerk number 2";
        zerg3.name = "Zerk number 3";
        zerg4.name = "Zerk number 4";
        zerg5.name = "Zerk number 5";
        zerg6.name = "Zerk number 6";
        zerg7.name = "Zerk number 7";
        zerg8.name = "Zerk number 8";
        zerg9.name = "Zerk number 9";
        zerg10.name = "Zerk number 10";

        Protos protos1 = new Protos();
        Protos protos2 = new Protos();
        Protos protos3 = new Protos();
        Protos protos4 = new Protos();
        Protos protos5 = new Protos();
        protos1.name = "Plot number 1";
        protos2.name = "Plot number 2";
        protos3.name = "Plot number 3";
        protos4.name = "Plot number 4";
        protos5.name = "Plot number 5";

        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        Terran terran5 = new Terran();
        Terran terran6 = new Terran();
        Terran terran7 = new Terran();
        Terran terran8 = new Terran();
        Terran terran9 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        Terran terran12 = new Terran();
        terran1.name = "Tuned number 1";
        terran2.name = "Tuned number 2";
        terran3.name = "Tuned number 3";
        terran4.name = "Tuned number 4";
        terran5.name = "Tuned number 5";
        terran6.name = "Tuned number 6";
        terran7.name = "Tuned number 7";
        terran8.name = "Tuned number 8";
        terran9.name = "Tuned number 9";
        terran10.name = "Tuned number 10";
        terran11.name = "Tuned number 11";
        terran12.name = "Tuned number 12";
    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}