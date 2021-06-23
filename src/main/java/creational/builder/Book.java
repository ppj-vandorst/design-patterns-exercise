package creational.builder;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private int yearOfRelease;
    private int numberOfPages;

    public Book(String isbn, String title, String author, int yearOfRelease, int numberOfPages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
        this.numberOfPages = numberOfPages;
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    // Setters
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    static class Builder {
        private String isbn;
        private String title;
        private String author;
        private int yearOfRelease;
        private int numberOfPages;

        public Builder(String isbn, String title) {
            this.isbn = isbn;
            this.title = title;
        }

        public Builder withAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder withYearOfRelease(int yearOfRelease) {
            this.yearOfRelease = yearOfRelease;
            return this;
        }

        public Builder withNumberOfPages(int numberOfPages) {
            this.numberOfPages = numberOfPages;
            return this;
        }

        public Book build() {
            return new Book(isbn, title, author, yearOfRelease, numberOfPages);
        }
    }
}
