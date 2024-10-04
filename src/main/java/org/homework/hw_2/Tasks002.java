package org.homework.hw_2;

/*
Задача №1

Необходимо создать целочисленные переменные a и b,
присвоить произвольные значения переменным на ваш выбор и
вывести результаты следующих операций с этими переменными:
сложение, умножение, вычитание, деление и остаток от деления.
Также сделать проверку на четность этих переменных и вывести результат.

 */

public class Tasks002 {
    public static void main(String[] args) {
        int a = 12;
        int b = 9;
        int sum = a + b;
        int diff = a - b;
        int multi = a * b;
        double dif = a / b;
        int modulo = (a / b)%2;

        if (a % 2 == 0)
            System.out.println ("Переменная 'a'= "+ a +" четная");
        else System.out.println ("Переменная 'a' не четная");
        if (b % 2 == 0)
            System.out.println ("Переменная 'b'= "+ b +" четная");
        else System.out.println ("Переменная 'b' не четная");

        System.out.println (sum);
        System.out.println (diff);
        System.out.println (multi);
        System.out.println (dif);
        System.out.println (modulo);




    }
}
