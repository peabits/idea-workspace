package composite_pattern.demo;

public class Leaf extends Component {
    @Override
    public void add(Component component) {
        throw new RuntimeException("未实现");
    }

    @Override
    public void remove(Component component) {
        throw new RuntimeException("未实现");
    }

    @Override
    public Component get(int i) {
        throw new RuntimeException("未实现");
    }

    @Override
    public void operation() {
        System.out.println(">>> Leaf -> operation");
    }
}
