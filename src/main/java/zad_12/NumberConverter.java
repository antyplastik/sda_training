package zad_12;

import java.util.Scanner;

public class NumberConverter {

    /*  Conversion mode:
        0 - off
        1 - binary
     */
    private int mode = 0;
    private int value;

    public NumberConverter() {
//        this.mode = 1;
    }

    public NumberConverter(int value) {
        this.value = value;
    }

    public int getValueFromUser() {
        System.out.print("Type value to convert: ");
        Scanner scanner = new Scanner(System.in);
        this.value = scanner.nextInt();

        return value;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public String binaryConversionToString(long value) {
        if (value == 0)
            value = this.value;

        String binaryValueString = "";
        String tmp = "";
        int strLen;
//        int loopIndex = 0;

        do {
            if (value % 2 == 1)
                tmp = tmp + '1';
            else
                tmp = tmp + '0';

            value = value / 2;

        } while (value > 0);

        strLen = tmp.length();

        for (int i = 0; i < strLen; i++)
            binaryValueString = binaryValueString + tmp.charAt((strLen - 1) - i);

        return binaryValueString;
    }

}
