package zad_6;

import java.util.Scanner;

public class Person {

//    String [] quest = new String {"Podaj dzien urodzenia: ", "Podaj miesiac urodzenia: ", "Podaj dzien urodzenia: "};
//    int [] date = new int [quest.length];

    String dateOfBirth = "";
    String datePattern = "dd.mm.yyyy";

    public Person() {
        System.out.println("Podaj swoj wiek w formacie "+ datePattern + ": ");
        Scanner scanner = new Scanner(System.in);
        this.dateOfBirth = scanner.nextLine();
    }
}
