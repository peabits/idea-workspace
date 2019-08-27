package decorator_pattern.demo;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println(">>> ConcreteComponent -> operation");
    }
}
