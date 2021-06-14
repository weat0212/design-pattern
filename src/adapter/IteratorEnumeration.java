package adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author I-Chung, Wang
 * @date 2021/6/14 下午 05:23
 */
public class IteratorEnumeration implements Enumeration {

    Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
