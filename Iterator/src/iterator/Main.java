package iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(10);
        bookShelf.appendBook(new Book("토비의 스프링"));
        bookShelf.appendBook(new Book("모던 자바 인 액션"));
        bookShelf.appendBook(new Book("표준 ORM JPA"));
        bookShelf.appendBook(new Book("자바의 정석"));

        Iterator iter = bookShelf.iterator();
        while(iter.hasNext()) {
            Book book = (Book) iter.next();
            System.out.println(book.getName());
        }
    }
}
