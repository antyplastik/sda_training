package Zad_10;

import java.util.Scanner;

public class Polidrome {

    private String inputString;

    public Polidrome() {
        System.out.print("Type a sentence that you want to check if it is a polidrome\n> ");
        Scanner scanner = new Scanner(System.in);
        this.inputString = scanner.nextLine();

    }

    public String getNumbersOfCharsInString(String str) {
//        str.replaceAll("\\s+","\n");
        int strLen = str.length();
        String tmp = "";
        for (int i = 0; i < strLen; i++)
            if ((str.charAt(i) != ' '))
                System.out.print(str.charAt(i) + " = " + Integer.valueOf(str.charAt(i)) + "\n");

        return tmp;
    }

    public boolean sentenceIsPolidrome(String str) {
        if (str.equals(null) || str.equals(""))
            str = inputString;

        int strLen = str.length();
        boolean isPolidrome = false;
        String revertStr = "";
        String tmpStr = "";

        str = str.toLowerCase();

        for (int i = 0; i < strLen; i++)
            if (str.charAt(i) != ' ')
                tmpStr = tmpStr + str.charAt(i);

        strLen = tmpStr.length();

        for (int i = 0; i < strLen; i++) {
            revertStr = revertStr + tmpStr.charAt((strLen-1) - i);
        }

//        System.out.println(tmpStr);

        System.out.println(tmpStr + " = " + revertStr);

        isPolidrome = revertStr.equals(tmpStr);

        return isPolidrome;
    }
}
