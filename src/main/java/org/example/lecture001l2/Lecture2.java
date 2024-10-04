package org.example.lecture001l2;

public class Lecture2 {
    public static void main(String[] args) {
        /*
        200 Простых солдат по 4 гульдена
        30 Доппельзольднеров по 8 гульденов
        2 Лейтенанта по 40 гульденов
        1 Капитан по 400 гульденов
         */
        System.out.println(200 * 4 + 30 * 8 + 2 * 40 + 400 );


        int lansers = 200;
        int doppelganger = 30;
        int lieutenant = 2;
        int captain = 1;

        int baseSalary = 4;

        int total = lansers * baseSalary +
                doppelganger * 2 * baseSalary  +
                lieutenant * 10 * baseSalary +
                captain * 100 * baseSalary;

        System.out.println("Total salary: " + total);

        /*
        200 * 4 + 30 * 8 + 2 * 40 + 400 = 1520
         */

    }
}
