import java.util.ArrayList;
import java.util.List;

public class Catalog<T> {
    private List<T> items;

    public Catalog() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(int index) {
        items.remove(index);
    }

    public T retrieveItem(int index) {
        return items.get(index);
    }

    public void printAll() {
        items.forEach(System.out::println);
    }
}