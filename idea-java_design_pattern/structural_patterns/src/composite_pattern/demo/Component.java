package composite_pattern.demo;

public abstract class Component {

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract Component get(int i);
    public abstract void operation();

}
