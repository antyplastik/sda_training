package zad_14;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CircleInSquare {

    private String fileLocation;
    private String fileName;
    private File file;
    private BufferedImage image;
    private Graphics2D drawer;

    public CircleInSquare() {

        this.fileLocation = "/home/kamil/Pulpit/pliki_testowe/";
        this.fileName = "myimage.png";
        this.file = new File(fileLocation + fileName);
        image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        drawer = image.createGraphics();

    }

    public void drawCircleInSquareToFile() {
        drawSquare();
        drawCircle();
        try {
            ImageIO.write(image,"png",file);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        drawer.dispose(); // zwolnienie pliku przez JRE
    }

    private void drawSquare() {
        drawer.setColor(Color.blue);
        drawer.fillRect(0,0,100,100); // 0,0 zawsze odnosi sie do lewego gornego boku

    }

    private void drawCircle() {
        drawer.setColor(Color.red);
        drawer.fillOval(0,0,100,100); // tak jakby kolo traktowane jak kwadrat

    }

}
