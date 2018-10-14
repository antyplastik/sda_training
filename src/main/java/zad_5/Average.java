package zad_5;

import java.util.Scanner;

public class Average {

    int numberOfNumber;
    double sumOfNumbers;

    public Average() {
        Scanner scanner = new Scanner(System.in);

        this.numberOfNumber = 1;
        this.sumOfNumbers = 0;

        while (true) {
            System.out.print("Podaj liczbe nr. " + numberOfNumber + ": ");
            this.sumOfNumbers = sumOfNumbers + scanner.nextDouble();
            if (numberOfNumber == 4){
                break;
            }
            else
                numberOfNumber++;
        }
    }
    public Double calcAverage(){
        return sumOfNumbers / numberOfNumber;
    }
}
