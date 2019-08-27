package bridge_pattern.example;

public class PNGImage extends Image {

    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        this.image.doPaint(matrix);
        System.out.println(fileName + " 格式为 .png");
    }

}
