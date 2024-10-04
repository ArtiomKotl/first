package org.concatination;

/***
 * 🟣 StringBuilder
 * Этот класс предоставляет метод append() для выполнения операций объединения,
 * однако этот вариант не потокобезопасен.
 */

public class StrBuilder {
    public static void main(String[] args) {
         StringBuilder str1 = new StringBuilder ("Hello");
         StringBuilder str2 = new StringBuilder (" World");
         StringBuilder result = str1.append ( str2 );

        System.out.println (result);
    }
}
