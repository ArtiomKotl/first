package org.concatination;

/***
 * 🟣 StringBuffer
 * Это аналогичный StringBuilder подход к объединению строк.
 * В отличие от StringBuilder, StringBuffer синхронизирован (т.е. потокобезопасен),
 * однако производительность у него хуже, чем у StringBuilder.
 */

public class StrBuffer {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("Hello");
        StringBuffer str2 = new StringBuffer(" World");
        StringBuffer result = str1.append(str2);

        System.out.println(result);

    }
}
