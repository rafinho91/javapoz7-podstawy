package oop.bookstore;

public class Book {
    private String title;
    private int releaseYear;
    private int numberOfPages;
    private String subjectMatter;

    private Author author;

    public Book(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                "author='" + (author != null ? author.getName() : " ") + '\'' +
                ", releaseYear=" + releaseYear +
                ", numberOfPages=" + numberOfPages +
                ", subjectMatter='" + subjectMatter + '\'' +
                '}';
    }

    public String getAuthorName() {
        return author != null ? author.getName() : null;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getSubjectMatter() {
        return subjectMatter;
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }

//    public void setReleaseYear(int year) {
//        this.releaseYear = year;
//    }


    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setSubjectMatter(String subjectMatter) {
        this.subjectMatter = subjectMatter;
    }
}
