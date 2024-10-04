package org.concatination;

public class OperatorPlus {
    public static void main(String[] args) {

        /*
          🟣 Оператор "+"
          Обеспечивает большую гибкость при конкатенации строк по сравнению с другими подходами.
         */

        String str1 = "Hello";
        String str2 = " World";
        String str3 = " !!!";

        System.out.println (str1 + str2 + str3);

        /*
          🟣 String.concat()
          Метод concat() добавляет указанную строку в конец текущей строки и возвращает новую объединенную строку.
          Учитывая, что класс String является неизменяемым, исходная строка не изменяется.
         */

        System.out.println(str1.concat(str2.concat(str3)));

        /*
        🟣 String.join()
        Этот способ позволяет конкатенировать строки с использованием разделителя.
         */

        String result = String.join(" ", "Hello", "World", "!!!");

        System.out.println(result);

        /*
        🟣 String.format()
        Используя спецификаторы формата, такие как %s,
        мы можем объединить несколько строк по их строковому значению или объекту.
         */


        String resultF = String.format("%s%s%s", str1, str2, str3);

        System.out.println(resultF);




    }
}
