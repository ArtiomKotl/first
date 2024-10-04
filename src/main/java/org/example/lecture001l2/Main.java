package org.example.lecture001l2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int myApple = 3;
        int yourApple = 10;
        int hisApples = 2 * myApple;
        int resultInt = (myApple + yourApple) / 2;
        double result = (myApple + yourApple) / 2.0;
        float f = 2.3f;

        System.out.println ("float = "+ f );
        int result2 = (myApple + yourApple) % 2;

//        int result = myApple + yourApple + hisApples;
        System.out.println (hisApples - yourApple);
        System.out.println (myApple + yourApple);
        System.out.println ( "Целочисленное деление 13/2 = " + resultInt);
        System.out.printf ( "double = " );
        System.out.println(result);
        System.out.println("Остаток от деления на %2 := " + result2);

        byte one = 1;
        byte two = 2;
        int three = one + two;

        System.out.printf ("String(10) + int(10) (конкатенация строк)  " );
        System.out.println ("10" + 10);

        char c = 65;
        System.out.println ("char=(65) --> " + c);


    }


}