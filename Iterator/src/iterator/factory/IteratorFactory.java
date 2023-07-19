package iterator.factory;

public class IteratorFactory extends Factory {

    private static IteratorFactory ifactory = new IteratorFactory();
    private IteratorFactory() {}

    public static IteratorFactory getInstance() {
        if(ifactory == null)
            ifactory = new IteratorFactory();
        return ifactory;
    }

    @Override
    public Iterator createProduct(Aggregate list, int type) {
        if(type == Iterator.FORWARD) {
            return new BookShelfIterator(list);
        } else if(type == Iterator.REVERSE) {
            return new ReverseShelfIterator(list);
        }
        return null;
    }
}
