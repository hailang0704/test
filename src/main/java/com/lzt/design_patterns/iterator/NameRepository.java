package com.lzt.design_patterns.iterator;

import java.util.Arrays;
import java.util.List;

/**
 * Created by viruser on 05/17.
 * 持有iterator对象，然后返回给外部调用
 */
public class NameRepository implements Container {
    public String names[] = {"Robert", "John", "Julie", "Lora"};
    public List<String> namesList = Arrays.asList(names);
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
