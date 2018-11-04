package zad_8;

import java.sql.SQLOutput;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Args {

    String inputString;
    List<Double> valueList = new ArrayList<Double>();
    private char STRING_SEPARATOR;

    public Args() {
        this.inputString = "";
        this.STRING_SEPARATOR = ' ';

//        System.out.println("Type numbers separator [space ; , ]: ");
//        Scanner scanner = new Scanner(System.in);
//        String tmp = scanner.nextLine();
//
//        if (tmp.equals("space") == true || tmp.equals(" "))
//            STRING_SEPARATOR = ' ';
//        else
//            this.STRING_SEPARATOR = tmp.charAt(0);
    }

    public Args(char STRING_SEPARATOR) {
        this.STRING_SEPARATOR = STRING_SEPARATOR;
    }

    public String getInputStringFromUser() {
        System.out.print("Enter numbers separed by spaces: ");
        Scanner scanner = new Scanner(System.in);
        this.inputString = scanner.nextLine();
        parseArgString(inputString);
        return this.inputString;
    }

    public void parseArgString(String str) {

        int strLen = str.length();
        String tmpStr = "";
//        int numberIndex = 0;

        for (int i = 0; i < strLen; i++) {
            if (str.charAt(i) == STRING_SEPARATOR) {
                valueList.add(Double.parseDouble(tmpStr));
                tmpStr = "";
            } else
                tmpStr = tmpStr + str.charAt(i);
        }

    }

    public void printInputString() {
        for (double value : valueList)
            System.out.print(value + " ");
    }

    public void printInputStringFromBehind() {

    }

    public void printInputStringOnOddPossition() {

    }

    public void printArgumentsDivisibleBy3() {

    }

    public void printSumOfArguments() {

    }

    public void printSumOfFirstFourArgs() {

    }

    public void printSumOfLastFiveHigherThan2() {

    }

}
