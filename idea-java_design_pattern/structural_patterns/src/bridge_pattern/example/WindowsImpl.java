package bridge_pattern.example;

public class WindowsImpl implements ImageImpl {
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println(">>> windows show image");
    }
}
