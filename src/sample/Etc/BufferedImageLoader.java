package sample.Etc;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class BufferedImageLoader {

    private BufferedImage image;

    private BufferedImage loadImage(String path)throws IOException{

        image = ImageIO.read(getClass().getResource(path));
        return image;
    }
}
