package zad_7;

import java.util.Scanner;

public class StringToUpperCase {

    public StringToUpperCase() {
        System.out.println("===== Zad.7 =====");
        System.out.println("Komenda q! konczy petle.");
        do {
            System.out.print("Podaj tekst ktory ma byc odwrocony na duze litery: ");

            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();

            if (str.equals("q!")) {
                System.out.println("Zadanie 7 zakonczone");
                break;
            } else {
                System.out.println("Odp. zad 7: "+str.toUpperCase());
            }
        } while (true);

    }
}
