import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Color;

public class ImageFilters {
    public static void main(String[] args) {
        try {
            // Load an image file
            BufferedImage image = loadFile("images/landscape.jpg");

            // apply a filter
            invertColors(image);

            // Save the edited file to desired location
            saveFile("images/invertedColors-landscape.jpg", image);

            // black and white
            blackAndWhite(image);

            // Save the edited file to desired location
            saveFile("images/blackAndWhite-landscape.jpg", image);

            // sepia
            sepia(image);

            // Save the edited file to desired location
            saveFile("images/sepia-landscape.jpg", image);

            BufferedImage image4 = loadFile("images/landscape.jpg");

            // valencia
            valencia(image4);

            // Save the edited file to desired location
            saveFile("images/valencia-landscape.jpg", image4);

            BufferedImage image5 = loadFile("images/landscape.jpg");

            // mirror
            mirror(image5);

            // Save the edited file to desired location
            saveFile("images/mirror-landscape.jpg", image5);

            BufferedImage image6 = loadFile("images/landscape.jpg");

            // mirror
            blueYellow(image6);

            // Save the edited file to desired location
            saveFile("images/blueYellow-landscape.jpg", image6);

            // to-do: create 9 more filters using the invertColors as a starting point
            // note you might need to run the filters separately to avoid altering the image
            // multiple times

            // to-do: save all changes as individual files using saveFile()

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    // helper methods
    // This method searches the folder path to the target image and returns a
    // BufferedImage object
    // using the data from the file
    public static BufferedImage loadFile(String pathToImage) throws IOException {
        // Load an image file
        File inputFile = new File(pathToImage);
        BufferedImage image = ImageIO.read(inputFile);
        return image;

    }

    // This method creates a new JPG file at the target save location, and copies
    // the data from the
    // BufferedImage object to the file.
    public static void saveFile(String saveLocation, BufferedImage image) throws IOException {
        // Save the edited image
        File outputFile = new File(saveLocation);
        outputFile.createNewFile();
        ImageIO.write(image, "jpg", outputFile);
        System.out.println("Image color changed and saved successfully!");
    }

    // filter methods

    // invert colors
    public static void invertColors(BufferedImage image) {
        // grab the dimensions
        int width = image.getWidth();
        int height = image.getHeight();

        // loop across the height and width of the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // grab the RGB color values of an individual pixel
                int pixel = image.getRGB(x, y);

                // create a Color obj using the RGB values of the pixel as a starting point
                Color color = new Color(pixel, true);

                // modify the RGB values of the color
                // the code below inverts colors
                color = new Color(255 - color.getRed(), 255 - color.getGreen(),
                        255 - color.getBlue());

                // update the pixel's color to the new color
                // this code directly modifies the BufferedImage
                image.setRGB(x, y, color.getRGB());
            }
        }

    }

    public static void blackAndWhite(BufferedImage image) {
        // grab the dimensions
        int width = image.getWidth();
        int height = image.getHeight();

        // loop across the height and width of the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // grab the RGB color values of an individual pixel
                int pixel = image.getRGB(x, y);

                // create a Color obj using the RGB values of the pixel as a starting point
                Color color = new Color(pixel, true);

                // modify the RGB values of the color
                // the code below inverts colors

                int average = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
                color = new Color(255 - average, 255 - average,
                        255 - average);

                // update the pixel's color to the new color
                // this code directly modifies the BufferedImage
                image.setRGB(x, y, color.getRGB());
            }
        }

    }

    public static void sepia(BufferedImage image) {
        // grab the dimensions
        int width = image.getWidth();
        int height = image.getHeight();

        // loop across the height and width of the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // grab the RGB color values of an individual pixel
                int pixel = image.getRGB(x, y);

                // create a Color obj using the RGB values of the pixel as a starting point
                Color color = new Color(pixel, true);

                // modify the RGB values of the color
                // the code below inverts colors

                double red = 0;
                if (color.getRed() >= 193) {
                    red = 1.07;
                } else if (color.getRed() >= 63) {
                    red = 1.15;
                } else {
                    red = 1.1;
                }

                double blue = 0;
                if (color.getBlue() >= 193) {
                    blue = 0.93;
                } else if (color.getBlue() >= 63) {
                    blue = 0.85;
                } else {
                    blue = 0.9;
                }

                // int average = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
                double l = 0.3 * color.getRed() + 0.59 * color.getGreen() + 0.11 * color.getBlue();
                // color = new Color(255 - (int) l, 255 - (int) l,
                // 255 - (int) l);
                color = new Color((int) (l * red), (int) l,
                        (int) (l * blue));

                // update the pixel's color to the new color
                // this code directly modifies the BufferedImage
                image.setRGB(x, y, color.getRGB());
            }
        }

    }

    public static void valencia(BufferedImage image) {
        // grab the dimensions
        int width = image.getWidth();
        int height = image.getHeight();

        // loop across the height and width of the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // grab the RGB color values of an individual pixel
                int pixel = image.getRGB(x, y);

                // create a Color obj using the RGB values of the pixel as a starting point
                Color color = new Color(pixel, true);

                // modify the RGB values of the color
                // the code below inverts colors

                double red = 0;
                if (color.getRed() >= 193) {
                    red = 0.9;
                } else if (color.getRed() >= 63) {
                    red = 1;
                } else {
                    red = 1.1;
                }

                double green = 0;
                if (color.getGreen() >= 193) {
                    green = 0.9;
                } else if (color.getGreen() >= 63) {
                    green = 1;
                } else {
                    green = 1.1;
                }

                double blue = 0;
                if (color.getBlue() >= 193) {
                    blue = 0.9;
                } else if (color.getBlue() >= 63) {
                    blue = 1;
                } else {
                    blue = 1.1;
                }

                // int average = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
                // double l = 0.3 * color.getRed() + 0.59 * color.getGreen() + 0.11 *
                // color.getBlue();
                // color = new Color(255 - (int) l, 255 - (int) l,
                // 255 - (int) l);

                color = new Color((int) ((color.getRed() + 15) * red), (int) ((color.getGreen() + 15) * green),
                        (int) ((color.getBlue()) * blue));

                // update the pixel's color to the new color
                // this code directly modifies the BufferedImage
                image.setRGB(x, y, color.getRGB());
            }
        }

    }

    public static void mirror(BufferedImage image) {
        // grab the dimensions
        int width = image.getWidth();
        int height = image.getHeight();

        // loop across the height and width of the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width / 2; x++) {

                // grab the RGB color values of an individual pixel
                int pixel = image.getRGB(x, y);

                // // create a Color obj using the RGB values of the pixel as a starting point
                // Color color = new Color(pixel, true);

                // // modify the RGB values of the color
                // // the code below inverts colors
                // color = new Color(color.getRed(), color.getGreen(),
                // color.getBlue());

                // update the pixel's color to the new color
                // this code directly modifies the BufferedImage

                int mirrorX = width - 1 - x;

                image.setRGB(mirrorX, y, pixel);
            }
        }

    }

    public static void blueYellow(BufferedImage image) {
        // grab the dimensions
        int width = image.getWidth();
        int height = image.getHeight();

        // loop across the height and width of the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // grab the RGB color values of an individual pixel
                int pixel = image.getRGB(x, y);

                // create a Color obj using the RGB values of the pixel as a starting point
                Color color = new Color(pixel, true);

                // modify the RGB values of the color
                // the code below inverts colors

                // double red = 0;
                // if (color.getRed() >= 193) {
                // red = 0.9;
                // } else if (color.getRed() >= 63) {
                // red = 1;
                // } else {
                // red = 1.1;
                // }

                // double green = 0;
                // if (color.getGreen() >= 193) {
                // green = 0.9;
                // } else if (color.getGreen() >= 63) {
                // green = 1;
                // } else {
                // green = 1.1;
                // }

                // double blue = 0;
                // if (color.getBlue() >= 193) {
                // blue = 0.9;
                // } else if (color.getBlue() >= 63) {
                // blue = 1;
                // } else {
                // blue = 1.1;
                // }

                int average = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
                // double l = 0.3 * color.getRed() + 0.59 * color.getGreen() + 0.11 *
                // color.getBlue();
                // color = new Color(255 - (int) l, 255 - (int) l,
                // 255 - (int) l);

                color = new Color(255 - average, 255 - average,
                        color.getBlue());

                // update the pixel's color to the new color
                // this code directly modifies the BufferedImage
                image.setRGB(x, y, color.getRGB());
            }
        }

    }

}
