package bridge_pattern.example;

public abstract class Image {

    protected ImageImpl image;

    public void setImage(ImageImpl image) {
        this.image = image;
    }

    public abstract void parseFile(String fileName);

}
