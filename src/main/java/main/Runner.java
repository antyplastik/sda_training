package main;

import Zad_10.Polidrome;
import zad_1.Sum;
import zad_11.Fibonacci;
import zad_12.NumberConverter;
import zad_13.FibonacciToBIN;
import zad_2.SumOfMultiples;
import zad_3.Strong;
import zad_4.StringInvertion;
import zad_5.Average;
import zad_6.Adult;
import zad_7.StringToUpperCase;
import zad_8.Args;
import zad_9.Square;

public class Runner {
    public static void main(String[] args) {
//        System.out.print("Enter number of exercise: ");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Podaj numer zadania: ");
//        int numberOfExcersise = scanner.nextInt();

        int numberOfExcersise = 13;

        switch (numberOfExcersise) {
            case 1:
                zad1();
                break;
            case 2:
                zad2();
                break;
            case 3:
                zad3();
                break;
            case 4:
                zad4();
                break;
            case 5:
                zad5();
                break;
            case 6:
                zad6();
                break;
            case 7:
                zad7();
                break;
            case 8:
                zad8();
                break;
            case 9:
                zad9();
                break;
            case 10:
                zad10();
                break;
            case 11:
                zad11();
                break;
            case 12:
                zad12();
                break;
            case 13:
                zad13();
                break;
            case 14:
                break;
            case 15:
                break;
        }
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
        Strong strong = new Strong(3);
    }

    public static void zad4() {
        StringInvertion stringInvertion = new StringInvertion();
        System.out.println("Odp. zad4: " + stringInvertion.executeStringInvertion());
    }

    public static void zad5() {
        Average average = new Average();
        System.out.println("Odp. zad 5: " + average.calcAverage());
    }

    public static void zad6() {
        Adult adult = new Adult();
        System.out.println("Odp. zad 6: " + adult.isAdult());

    }

    private static void zad7() {
        StringToUpperCase string = new StringToUpperCase();
    }

    private static void zad8() {
        Args args = new Args();
//        args.parseArgString(args.getInputStringFromUser());
        args.parseArgString("1 2 3 4 5 6 7");
        args.printInputString();
    }

    private static void zad9() {
        Square square = new Square();
        square.printSquareToConsole(square.generateSquare(false));
    }

    private static void zad10() {
        Polidrome polidrome = new Polidrome();
//        System.out.println(polidrome.getNumbersOfCharsInString("Ąą Ćć Ęę Óó Źź Żż"));
        System.out.println("Or the sentence is a polidrome: " + polidrome.sentenceIsPolidrome(""));
    }

    private static void zad11() {
        Fibonacci fibonacciSequence = new Fibonacci();
        fibonacciSequence.getNumberOfValuesFromUser();
        fibonacciSequence.SilentMode(true);
        fibonacciSequence.ShowDependencies(false);
        TimeMeasurement time = new TimeMeasurement();
        fibonacciSequence.calcFibonacciSequence();
        System.out.println("Fibonacci sequence calc: " + time.getAformattedTime());
        fibonacciSequence.printFibonacciSequence();
        fibonacciSequence.printSequence(fibonacciSequence.reverseFibonacciSequence());
        fibonacciSequence.printSequence(fibonacciSequence.oddNumbersOfFibonacciSequence());
        fibonacciSequence.printSequence(fibonacciSequence.numbersOfFibonacciDividedBy3());
        System.out.println("Sum of " + fibonacciSequence.getNumberOfValues() + " elements is: " + fibonacciSequence.sumOfAllNumbers());
        fibonacciSequence.printSequence(fibonacciSequence.getFirst4NumbersFromFibonacciArray());
        System.out.println("Sum of last 5 elements (or less) higher than 2: " + fibonacciSequence.getSumOfLast5numbersHigherThan2());
    }

    private static void zad12() {
        NumberConverter numberConverter = new NumberConverter();
        System.out.println(numberConverter.binaryConversionToString(numberConverter.getValueFromUser()));
    }

    private static void zad13() {
        FibonacciToBIN fibonacci = new FibonacciToBIN();
        fibonacci.printBinarySequence(fibonacci.calcFibonacciBinarySequence());
        fibonacci.printSequence();
    }

}
