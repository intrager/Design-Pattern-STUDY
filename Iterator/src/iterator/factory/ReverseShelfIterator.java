package iterator.factory;

public class ReverseShelfIterator implements Iterator {

    private BookShelf list;
    private int index;

    public ReverseShelfIterator(Aggregate list) {
        this.list = (BookShelf) list;
        index = list.getLength()-1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0 ? true : false;
    }

    @Override
    public Object next() {
        return index >= 0 ? list.getAt(index--) : null;
    }
}
