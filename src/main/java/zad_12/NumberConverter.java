package zad_12;

import java.math.BigInteger;
import java.util.Scanner;

public class NumberConverter {

    /*  Conversion mode:
        0 - off
        1 - binary
     */
    private int mode = 0;
    private BigInteger value;

    public NumberConverter() {
//        this.mode = 1;
    }

    public NumberConverter(BigInteger value) {
        this.value = value;
    }

    public BigInteger getValueFromUser() {
        System.out.print("Type value to convert: ");
        Scanner scanner = new Scanner(System.in);
        this.value = new BigInteger(scanner.nextLine());

        return value;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public String binaryConversionToString(BigInteger value) {
        if (value.equals(new BigInteger("0")))
            value = this.value;

        String binaryValueString = "";
        StringBuilder tmp = new StringBuilder();
        int strLen;
        BigInteger two = new BigInteger("2");
        BigInteger one = new BigInteger("1");
//        int loopIndex = 0;

        do {
            if (value.mod(two).equals(one)) // (value % 2 == 1)
                tmp = tmp.append('1');
            else
                tmp = tmp.append('0');

//            value = value / 2;
            value = value.divide(two);

        } while (value.compareTo(BigInteger.ZERO) > 0); //(value > 0);

        strLen = tmp.length();

        for (int i = 0; i < strLen; i++)
            binaryValueString = binaryValueString + tmp.charAt((strLen - 1) - i);

        return binaryValueString;
    }

}
