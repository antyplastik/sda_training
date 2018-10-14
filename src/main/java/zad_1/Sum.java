package zad_1;

import java.util.Scanner;

public class Sum {

    private double a;
    private double b;

    public Sum(){};

    public Sum(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double add() {
        return this.a + this.b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void getValuesFromUser() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                System.out.print("Podaj pierwsza liczbe: ");
                this.a = scanner.nextDouble();
            } else if (i == 1) {
                System.out.print("Podaj druga liczbe: ");
                this.b = scanner.nextDouble();
            }
        }
    }

}
