package zad_9;

import java.util.Scanner;

public class Square {

    private int sizeOfSide = 3;

    public Square() {
//        this.sizeOfSide = 3;
        System.out.print("Type size of square side: ");
        Scanner scanner = new Scanner(System.in);
        this.sizeOfSide = scanner.nextInt();
    }

    public String[] generateSquare(boolean fulfillment) {
        String[] strArr = new String[sizeOfSide];

        for (int line = 0; line < sizeOfSide; line++)
            for (int row = 0; row < sizeOfSide; row++) {
                if (fulfillment == true) {
                    if (row == 0)
                        strArr[line] = "*";
                    else
                        strArr[line] = strArr[line] + " *";
                } else {
                    if (line == 0 || line == sizeOfSide - 1)
                        if (row == 0)
                            strArr[line] = "*";
                        else
                            strArr[line] = strArr[line] + " *";
                    else if (row == 0)
                        strArr[line] = "*";
                    else if (row == sizeOfSide - 1)
                        strArr[line] = strArr[line] + " " + "*";
                    else
                        strArr[line] = strArr[line] + "  ";
                }
            }
        return strArr;
    }

    public void printSquareToConsole(String[] strArray) {
        int strLen = strArray.length;

//        for (int line = 0; line < strLen; line++)
//            System.out.println(strArray[line]);

        for (String line : strArray)
            System.out.println(line);
    }

}
