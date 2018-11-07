package zad_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    private long numberOfValues;
    private boolean silentMode;
    private boolean showDependencies;
    private boolean binaryConversion;
    private List<Long> fibonacciArray = new ArrayList<Long>();

    public Fibonacci() {
        System.out.println("===== Zad.11 =====");
        this.silentMode = true;
        this.showDependencies = false;
        this.binaryConversion = false;
    }

    public Fibonacci(long numberOfValues) {
        this.numberOfValues = numberOfValues;
        this.silentMode = true;
        this.showDependencies = false;
        this.binaryConversion = false;
    }

    public void setNumberOfValues(long numberOfValues) {
        this.numberOfValues = numberOfValues;
    }

    public void setBinaryConversion(boolean binaryConversion) {
        this.binaryConversion = binaryConversion;
    }

    public void getNumberOfValuesFromUser() {
        System.out.print("Podaj liczbe elementow ciagu Fibonacciego: ");
        Scanner scanner = new Scanner(System.in);
        this.numberOfValues = scanner.nextLong();
    }

    public void SilentMode(boolean silentMode) {
        this.silentMode = silentMode;
    }

    public void ShowDependencies(boolean showDependencies) {
        this.showDependencies = showDependencies;
    }

    public long getNumberOfValues() {
        return numberOfValues;
    }

    public void calcFibonacciSequence() {
        Long previous = new Long(0);
        Long actual = new Long(1);

//        NumberConverter numberConverter;
//        if(binaryConversion == true)
//            numberConverter = new NumberConverter();

        for (int i = 0; i < numberOfValues; i++) {
            if (silentMode == false && showDependencies == false)
                System.out.print(previous + " ");
            else if (showDependencies == true)
                System.out.println(previous + " + " + actual + " = " + (previous + actual));
            actual = previous + actual;
            previous = actual - previous;

            if (binaryConversion == true)
                ;
            else
                fibonacciArray.add(actual);
        }
    }

    public List getFibonacciSequence(){
        List tmp = new ArrayList(fibonacciArray);

        return tmp;
    }

    public List reverseFibonacciSequence() {
        List tmp = new ArrayList(fibonacciArray); // poprawne kopiwanie listy; nie mozna po porstu nowa_lista = lista, bo wtedy nowa_lista robi za wskaznik do lista!!!
        Collections.reverse(tmp);
        return tmp;
    }

    public List oddNumbersOfFibonacciSequence() {
        List tmpList = new ArrayList();
        long fibonacciArraySize = fibonacciArray.size();

        for (int i = 0; i < fibonacciArraySize; i++) {
            if (fibonacciArray.get(i) % 2 != 0)
                tmpList.add(fibonacciArray.get(i));
        }
        return tmpList;
    }

    public List numbersOfFibonacciDividedBy3() {
        List tmpList = new ArrayList();
        long fibonacciArraySize = fibonacciArray.size();

        for (int i = 0; i < fibonacciArraySize; i++) {
            if (fibonacciArray.get(i) % 3 == 0)
                tmpList.add(fibonacciArray.get(i));
        }
        return tmpList;
    }

    public long sumOfAllNumbers() {
        List tmpList = new ArrayList(fibonacciArray);
        long tmpSize = tmpList.size();
        long result = 0;

        for (int i = 0; i < tmpSize; i++) {
            result = result + ((Long) tmpList.get(i));
        }
        return result;
    }

    public List getFirst4NumbersFromFibonacciArray() {
        List tmpList = new ArrayList();
        long fibonacciSize = fibonacciArray.size();

        if (fibonacciSize > 4) {
            for (int i = 0; i < 4; i++)
                tmpList.add(fibonacciArray.get(i));
        } else if (fibonacciSize <= 4)
            for (int i = 0; i < fibonacciSize; i++)
                tmpList.add(fibonacciArray.get(i));

        return tmpList;
    }

    public long getSumOfLast5numbersHigherThan2() {
        List<Long> tmpList = new ArrayList(fibonacciArray);
        int fibonacciSize = tmpList.size();
        long result = 0;
        long tmp;

//        Collections.reverse(tmpList); // reverse for fun

        if (fibonacciSize >= 5)
            for (int i = 0; i < 5; i++) {
                tmp = tmpList.get((fibonacciSize-1) - i);
                if (tmp > 2)
                    result = result + tmp;
            }
        else if (fibonacciSize < 5)
            for (int i = 0; i < fibonacciSize; i++) {
                tmp = tmpList.get((fibonacciSize-1) - i);
                if (tmp > 2)
                    result = result + tmp;
            }


        return result;
    }

    public void printFibonacciSequence() {
        printSequence(fibonacciArray);
    }

    public void printSequence(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1)
                System.out.println(list.get(i));
            else
                System.out.print(list.get(i) + " ");
        }
    }
}

