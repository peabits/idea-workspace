package bridge_pattern.example;

public class LinuxImpl implements ImageImpl {
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println(">>> Linux show image");
    }
}
