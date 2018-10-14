package main;

import zad_1.Sum;
import zad_2.SumOfMultiples;

public class Runner {
    public static void main(String[] args) {
//        1.
    zad1();
//        2.
    zad2();

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

}
