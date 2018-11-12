package Zad_16;

public class StringCalculator {

    private String inputStr;

    public StringCalculator(String inputString) {
        this.inputStr = inputString;
    }

    public void setInputStr(String inputStr) {
        this.inputStr = inputStr;
    }

    public String add(String str) {
        String result = "";

        result = inputStr + str;

        return result;
    }

    public String sub(String str) {
        String result = "";
        int inputStrLen = inputStr.length();
        int strLen = str.length();
        int resultLen = 0;

        if (str != null || str != "")
            for (int i = 0; i < strLen; i++) {
                if (inputStr.charAt((inputStrLen - 1) - i) == str.charAt((strLen - 1) - i)) {
                    if (result == "")
                        for (int j = 0; j < inputStrLen - 1; j++)
                            result = result + inputStr.charAt(j);
                    else if (result != "") {
                        result = "";
                        for (int j = 0; j < resultLen - 1; j++)
                            result = result + inputStr.charAt(j);
                    }
                    resultLen = result.length();
                }

            }
        else if (inputStr == str)
            result = "";
        else
            result = inputStr;

        return result;
    }

    public String uniq() { // znaki ktore sie nie powtarzaja w inputStr
        String result = "";
//        String tmpStr = "";
        int inputStringLen = inputStr.length();
        int[] repeatedCharacters = new int[inputStringLen];
        char tmpChar;

        for (int i = 0; i < inputStringLen; i++) {
            tmpChar = inputStr.charAt(i);

            for (int j = 0; j < inputStringLen; j++) {
                if (tmpChar != inputStr.charAt(j)) {
                    repeatedCharacters[i] = repeatedCharacters[i] + 1;
//                    result = result + tmpChar;
                }
            }
        }

        for (int k = 0; k < inputStringLen; k++)
            if (repeatedCharacters[k] == 1)
                result = result + inputStr.charAt(k);
//
//        int tmpStrLen = tmpStr.length();
//
//        for (int m = 0; m < tmpStrLen; m++) {
//            tmpChar = tmpStr.charAt(m);
//            for (int n = m; n < tmpStrLen; n++)
//                if (tmpChar == tmpStr.charAt(n) && n > m)
//                    result = result + tmpChar;
//                    repeatedCharacters[n] = 0;
//        }
//        tmpStr = "";
//
//        for (int k = 0; k < inputStringLen; k++)
//            if (repeatedCharacters[k] > 1)
//                tmpStr = tmpStr + inputStr.charAt(k);

        return result;
    }

    public String inter(String str) { // tylko znaki ktore sie powtarzaja
        String result = "";

        return result;
    }

    public String subM(String str) { // znaki str ktore sie nie powtarzaja w inputStr
        String result = "";

        return result;
    }

    public String dimD(String str) { // te znaki ktore sie nie powtarzaja w inputStr
        String result = "";

        return result;
    }
}
