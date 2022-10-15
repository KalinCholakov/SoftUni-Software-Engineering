package iteratorsAndComparators.lab.ex03ComparableBook;

import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        setTitle(title);
        setYear(year);
        setAuthors(authors);
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    private void setAuthors(String[] authors) {
        this.authors = Arrays.asList(authors);
    }

    public List<String> getAuthors() {
        return authors;
    }

    @Override
    public int compareTo(Book other) {
        int result = this.title.compareTo(other.getTitle());

        if (result == 0) {
            result = Integer.compare(this.getYear(), other.getYear());
        }
        return result;
    }
}
