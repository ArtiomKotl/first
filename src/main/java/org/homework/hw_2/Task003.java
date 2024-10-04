package org.homework.hw_2;

//Задача №2.
//
// Создать программу дележа добычи на пиратском корабле.
//        По обычаю, половина добычи идет владельцу корабля,
//половина оставшегося — капитану,
//остальное делится поровну между всеми членами команды, включая капитана.
//Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
//Вывести на экран кому сколько пиастров полагается.
//
//Дополнительное задание со звездочкой.
//
//Попробовать придумать как программа может проверить правильность дележа.

public class Task003 {

    public static void main(String[] args) {
        int pirates = 20;
        double piastres = 1800;

        double ownerShipCash = piastres / 2;

        double piratesCash = (ownerShipCash / 2) / (pirates + 1);
        double captainShipCash = (ownerShipCash / 2) + piratesCash;
        double captainJackSparrow = ownerShipCash + captainShipCash;
        double checkCash = (piratesCash * (pirates + 1)) + (captainShipCash - piratesCash) + ownerShipCash ; //TODO переписать через if проверку правильности дележа пиастр //

        System.out.println ("Владельцу корабля = " + ownerShipCash + " пиастр");
        System.out.println ("Капитану корабля = " + captainShipCash + " пиастр");
        System.out.println ("Членам корабля по = " + piratesCash + " пиастр");
        System.out.println (checkCash + " = " + piastres);
        System.out.println ("Если Корабль Вlack Pearl то Капитан Jack Sparrow получит " + captainJackSparrow + " пиастр");







    }
}
