package zad_2;

import zad_1.Sum;

import java.util.Scanner;

public class SumOfMultiples {

    double a;
    double b;
    double n;

    public SumOfMultiples() {
        System.out.println("===== Zad.2 =====");
    }

    public void getValuesFromUser() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            if (i == 0) {
                System.out.println("Podaj liczbe n: ");
                this.n = scanner.nextDouble();
            } else if (i == 1) {
                System.out.print("Podaj pierwsza liczbe: ");
                this.a = scanner.nextDouble();
            } else if (i == 2) {
                System.out.print("Podaj druga liczbe: ");
                this.b = scanner.nextDouble();
            }
        }
    }

    public double calcSumOfMultiples() {
        double sum = 0;
        for (int i = 0; i < this.n; i++) {
            if ((this.n % this.a) <= this.n)
                sum = this.n % this.a + sum;

            if ((this.n % this.b) <= this.n)
                sum = this.n % this.b + sum;
        }
        return sum;
    }

}
