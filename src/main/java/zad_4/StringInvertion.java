package zad_4;

public class StringInvertion {

    String string_to_invert;

    public StringInvertion() {
        System.out.println("===== Zad.4 =====");
        this.string_to_invert = "programuje w javie";
    }

    public StringInvertion(String string_to_invert) {
        System.out.println("===== Zad.4 =====");
        this.string_to_invert = string_to_invert;
        System.out.println(string_to_invert);
    }

    public String executeStringInvertion(){
//        string_to_invertL_local = string_to_invert;
        String strTmp = "";
        int strLen = string_to_invert.length();

        for (int i = 0; i < strLen; i++){
          strTmp = strTmp + string_to_invert.charAt(strLen-1 - i);
        }

        return strTmp;
    }

}
