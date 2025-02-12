package opgave02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PeopleArray<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void printItem() {
        System.out.println(items);
    }

    /**
     * Returns from the list the first person
     * that satisfies the predicate.
     * Returns null, if no person satisfies the predicate.
     */
    public T findFirst(Predicate<T> filter) {
        for (T item : items) {
            if (filter.test(item)) {
                return item;
            }
        }
        return null;
    }

    public List<T> findAll(Predicate<T> filter) {
        List<T> result = new ArrayList<>();
        for (T item  : items) {
            if (filter.test(item)) {
                result.add(item);
            }

        }
        return result;
    }
}