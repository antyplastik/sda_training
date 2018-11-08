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
        ArrayList<String> fibStrigSeq = (ArrayList<String>) fibonacci.getFibonacciBinArray();
        


    }

    public void drawApixel(int x, int y) {
        drawer.fillRect(x, y, 1, 1);
    }

    public void saveAndUnlockPic() {
        drawer.dispose();
        try {
            ImageIO.write(image,"png",file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
