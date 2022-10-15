package iteratorsAndComparators.lab.ex04BookComparator;


import iteratorsAndComparators.lab.ex03ComparableBook.Book;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book f, Book s) {
        int result = f.getTitle().compareTo(s.getTitle());

        if (result == 0) {
            result = Integer.compare(f.getYear(), s.getYear());
        }
        return result;
    }
}
