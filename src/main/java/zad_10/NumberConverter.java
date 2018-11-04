package zad_10;

public class NumberConverter {

    /*  Conversion mode:
        0 - off
        1 - binary
     */
    private int mode = 0;

    public NumberConverter(int mode) {
        this.mode = mode;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public String binaryConversionToString(double value){
        String binaryValueString = "";

        do{
            if (value%2 >=1)
                binaryValueString = binaryValueString + "1";
            else
                binaryValueString = binaryValueString + "0";


        } while(true);
    }

}
