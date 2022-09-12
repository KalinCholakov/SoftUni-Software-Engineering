package articles2;

public class Article2 {
    private final String title;
    private final String content;
    private final String author;

    public Article2(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    @Override
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }
}


