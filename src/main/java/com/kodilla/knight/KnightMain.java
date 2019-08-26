package com.kodilla.knight;

public class KnightMain {
    public static void main (String[] args) {
        Knight knight = new Knight();
        String quest1 = "Dead Island Quest: " + knight.deadIslandQuest.process() + " Is finished.";
        String quest2 = "Elite Knight Quest " + knight.eliteKnightQuest.process() + " Is finished";
        System.out.println(quest1);
        System.out.println(quest2);
    }
}
