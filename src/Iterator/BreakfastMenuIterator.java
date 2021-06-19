package Iterator;

import java.util.ArrayList;

public class BreakfastMenuIterator implements Iterator {

    ArrayList items;
    private int index = 0;
    private int size;

    public BreakfastMenuIterator(ArrayList items) {
        this.items = items;
        if (items.size() != 0) {
            this.size = items.size();
        } else {
            System.out.println("Error");
        }
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }

    @Override
    public Object next() {
        return items.get(index++);
    }
}
