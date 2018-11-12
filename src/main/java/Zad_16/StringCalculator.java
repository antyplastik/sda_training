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
                if (inputStr.charAt((inputStrLen -1) -i) == str.charAt((strLen -1) - i)) {
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

    public String uniq() {
        String result = "";

        return result;
    }

    public String inter(String str) {
        String result = "";

        return result;
    }

    public String subM(String str) {
        String result = "";

        return result;
    }

    public String dimD(String str) { // te znaki ktore sie nie powtarzaja
        String result = "";

        return result;
    }
}
