package iterator.factory;

public class BookShelfIterator implements Iterator {

    private BookShelf list;
    private int index = 0;

    public BookShelfIterator(Aggregate list) {
        this.list = (BookShelf) list;
    }

    @Override
    public boolean hasNext() {
        return index < list.getLength() ? true : false;
    }

    @Override
    public Object next() {
        return list.getAt(index++);
    }
}
