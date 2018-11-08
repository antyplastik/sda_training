package zad_13;

import zad_11.Fibonacci;
import zad_12.NumberConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciToBIN {

    private Fibonacci sequence;
    private NumberConverter value;
    private long numberOfValues;
    private List<String> fibonacciBinArray;

    public FibonacciToBIN() {
        System.out.println("===== Zad 13 =====");

        System.out.print("Typer number of elements: ");
        Scanner scanner = new Scanner(System.in);
        numberOfValues = scanner.nextLong();

        sequence = new Fibonacci(numberOfValues);
        value = new NumberConverter();
    }

    public FibonacciToBIN(long numberOfValues) {
        this.numberOfValues = numberOfValues;
        sequence = new Fibonacci(numberOfValues);
        value = new NumberConverter();
    }

    public List calcFibonacciBinarySequence() {

        sequence.calcFibonacciSequence();
        List<Long> tmpLongList = new ArrayList(sequence.getFibonacciSequence());
        fibonacciBinArray = new ArrayList<String>();

        long arrLen = tmpLongList.size();
        long tmpVal;

        for (int i = 0; i < arrLen; i++) {
            tmpVal = tmpLongList.get(i);
            fibonacciBinArray.add(value.binaryConversionToString(tmpVal));
        }

        return fibonacciBinArray;
    }

    public List<String> getFibonacciBinArray() {
        return fibonacciBinArray;
    }

    public void printBinarySequence(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1)
                System.out.println(list.get(i));
            else
                System.out.print(list.get(i) + " ");
        }
    }

    public void printSequence (){
        List tmp = new ArrayList(sequence.getFibonacciSequence());
        printBinarySequence(tmp);
    }
}
