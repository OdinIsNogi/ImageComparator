package org.example;

import imageComparator.ImageComparator;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        ImageComparator comparator = new ImageComparator();
        Boolean image = comparator.isTheSameImage(ImageIO.read(new File("src/main/resources/one.png")),
                ImageIO.read(new File("src/main/resources/threeOne.png")));
        System.out.println(image);
    }
}
