package iteratorsAndComparators.lab.ex02LibraryVar2;

import iteratorsAndComparators.lab.ex01Book.Book;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Library implements Iterable<Book> {

    private List<Book> books;

    public Library(Book... books) {
        this.books = Arrays.asList(books);
    }

    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }
}
