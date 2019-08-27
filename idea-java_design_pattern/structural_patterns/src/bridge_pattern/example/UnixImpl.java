package bridge_pattern.example;

public class UnixImpl implements ImageImpl {
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("Unix show image");
    }
}
