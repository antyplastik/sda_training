package main;

import zad_1.Sum;
import zad_2.SumOfMultiples;
import zad_4.StringInvertion;

public class Runner {
    public static void main(String[] args) {
//        1.
//        zad1();
//        2.
//        zad2();
//        3.
//        zad3();
//        4.
        zad4();
//        5.
//        zad5();
//        6.
//        7.
//        8.
//        9.
//        10.
//        11.
//        12.
//        13.
//        14.
//        15.
//        16.
//        17.
    }

    public static void zad1() {
        Sum sum = new Sum();
        sum.getValuesFromUser();
        System.out.println("Odp zad.1: " + "Suma liczb a=" + sum.getA() + " b=" + sum.getB() + " jest rowna " + sum.add());
    }

    public static void zad2() {
        SumOfMultiples sumOfMultiples = new SumOfMultiples();
        sumOfMultiples.getValuesFromUser();

        System.out.println("Odp zad.2: " + sumOfMultiples.calcSumOfMultiples());
    }

    public static void zad3() {

    }

    public static void zad4() {
        StringInvertion stringInvertion = new StringInvertion();
        System.out.println("Odp. zad4: "+stringInvertion.executeStringInvertion());
    }

    private static void zad5() {
    }

}
