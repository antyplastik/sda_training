package zad_15;

import zad_13.FibonacciToBIN;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class BinaryToPic {

    private String filePath;
    private String fileName;
    private File file;
    private BufferedImage image;
    private Graphics2D drawer;
    private int picWidth;
    private int picHeight;

    /*
            1   2   3
            2   2   3
            3   3   3

     */

    public BinaryToPic() {
        this.filePath = "/home/kamil/Pulpit/pliki_testowe/";
        this.fileName = "fibonacci_to_picure";
        file = new File(filePath + fileName);
        picWidth = 1000;
        picHeight = picWidth;

        image = new BufferedImage(picWidth, picHeight, BufferedImage.TYPE_INT_RGB); // polygon
        drawer = image.createGraphics(); // objects on the polygon
    }

    public void drawFibonacci() {
        FibonacciToBIN fibonacci = new FibonacciToBIN(picWidth);
        fibonacci.calcFibonacciBinarySequence();
        ArrayList<String> fibonacciStringList = (ArrayList<String>) fibonacci.getFibonacciBinArray();

        String stringOfBinaryValue;
        char bitOfBinaryValue;
        int binaryValueStrLength;
        int binaryValueStrIndex = 0;

        for (int y = 0; y < picHeight; y++) {
            stringOfBinaryValue = fibonacciStringList.get(y);
            binaryValueStrLength = stringOfBinaryValue.length();
            binaryValueStrIndex = 0;

            for (int x = 0; x < picWidth; x++) {
                if (x >= picWidth - binaryValueStrLength) {
                    bitOfBinaryValue = stringOfBinaryValue.charAt(binaryValueStrIndex);

                    if (bitOfBinaryValue == '1')
                        drawApixel(x, y, "black");
                    else if (bitOfBinaryValue == '0')
                        drawApixel(x, y, "white");
                    else
                        System.out.println("Binary value index error");

                    if (binaryValueStrIndex < binaryValueStrLength)
                        binaryValueStrIndex++;

                } else
                    drawApixel(x, y, "white");

            }
        }
    }

    private void stringToPixel() {

    }

    public void drawApixel(int x, int y, String color) {
        color = color.toLowerCase();
        if (color.equals("black"))
            drawer.setColor(Color.black);
        else if (color.equals("white"))
            drawer.setColor(Color.white);

        drawer.fillRect(x, y, 1, 1);
    }

    public void saveAndUnlockPic() {
        drawer.dispose();
        try {
            ImageIO.write(image, "png", file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
