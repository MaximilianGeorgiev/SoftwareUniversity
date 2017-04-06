package Library;

import java.util.Iterator;

/**
 * Created by 200sx on 4/1/2017.
 */
public class Library<B> implements Iterable<Book> {
    private Book[] books;

    public Library(Book... books){
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }

    private final class LibIterator implements Iterator<Book>{
        private int counter = 0;

        private LibIterator(){
            this.counter = 0;
        }

        @Override
        public boolean hasNext() {
            return this.counter < books.length;
        }

        @Override
        public Book next() {
            return books[counter++];
        }
    }
}
