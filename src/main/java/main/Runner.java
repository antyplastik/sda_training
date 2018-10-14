package main;

import zad_1.Sum;

public class Runner {
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.getValuesFromUser();

        System.out.println("Suma liczb a="+ sum.getA()+" b="+sum.getB()+" jest rowna "+sum.add());
    }
}
