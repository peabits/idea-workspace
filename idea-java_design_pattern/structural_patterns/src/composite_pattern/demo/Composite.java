package composite_pattern.demo;

import java.util.ArrayList;

public class Composite extends Component {

    private ArrayList<Component> list = new ArrayList<>();

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public Component get(int i) {
        return list.get(i);
    }

    @Override
    public void operation() {
        for (Component component : list) {
            component.operation();
        }
    }
}
