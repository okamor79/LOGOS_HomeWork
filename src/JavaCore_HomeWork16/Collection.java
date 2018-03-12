package JavaCore_HomeWork16;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    private List<Object> arr;

    public Collection(List<Object> arr) {
        this.arr = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Collection{" +
                "arr=" + arr +
                '}';
    }

    public List<Object> getArr() {
        return arr;
    }

    public void setArr(List<Object> arr) {
        this.arr = arr;
    }

    public void printFirstToLast() {
        Iterator iter = this.new firstToLastIterator();
        while(iter.hasNext()) {
                System.out.println(iter.next());
        }
    }

    public void printLastToString() {
        Iterator iter = this.new lastToFirstIterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    interface Iterator extends java.util.Iterator<Object> { }

    private class firstToLastIterator implements Iterator {
        private int nextIndex = 0;

        @Override
        public boolean hasNext() {
            return (nextIndex < arr.size() );
        }

        @Override
        public Object next() {
            Object retValue;
            if(nextIndex % 2 == 0) {
                retValue = 0;
            } else {
                retValue = arr.get(nextIndex).toString();
            }
            nextIndex += 1;
            return retValue;
        }
    }

    private class lastToFirstIterator implements Iterator {
        private int nextIndex = arr.size() - 1;

        @Override
        public boolean hasNext() {
            return (nextIndex > 0);
        }

        @Override
        public Object next() {
            Object retValue;
            retValue = arr.get(nextIndex).toString();
            nextIndex -= 2;
            return retValue;
        }

    }

}
