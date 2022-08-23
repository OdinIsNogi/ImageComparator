package imageComparator;

import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.model.ImageComparisonResult;
import com.github.romankh3.image.comparison.model.ImageComparisonState;

import java.awt.image.BufferedImage;

public class ImageComparator {

    public boolean isTheSameImage(BufferedImage img1, BufferedImage img2) {
        ImageComparison imageComparison = new ImageComparison(img1, img2);

        ImageComparisonResult result = imageComparison.compareImages();
        return ImageComparisonState.MATCH == result.getImageComparisonState();
    }
}
