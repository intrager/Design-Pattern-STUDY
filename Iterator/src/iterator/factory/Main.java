package iterator.factory;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(10);
        bookShelf.appendBook(new Book("이것이 자바다"));
        bookShelf.appendBook(new Book("이펙티브 자바"));
        bookShelf.appendBook(new Book("클린코드"));
        bookShelf.appendBook(new Book("리팩토링"));

        Iterator iter = bookShelf.iterator(Iterator.FORWARD);
        while(iter.hasNext()) {
            Book book = (Book) iter.next();
            System.out.println(book.getName());
        }

        System.out.println("==============================================");

        Iterator reverse = bookShelf.iterator(Iterator.REVERSE);
        while(reverse.hasNext()) {
            Book book = (Book) reverse.next();
            System.out.println(book.getName());
        }
    }
}
