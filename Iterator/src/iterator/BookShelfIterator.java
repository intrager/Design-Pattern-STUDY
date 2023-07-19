package iterator;

public class BookShelfIterator implements Iterator {

    private BookShelf list;
    private int index = 0;

    public BookShelfIterator(Aggregate list) {
        this.list = (list instanceof BookShelf) ? (BookShelf) list : null;
    }

    @Override
    public boolean hasNext() {
        return index < list.getLength() ? true : false;
    }

    @Override
    public Object next() {
        Book book = list.getAt(index);
        index++;
        return book;
    }
}
