public class Book {
    private String title;
    private int year;
    private Author name;

    public Book(String title, int year, Author name) {
        this.title = title;
        this.year = year;
        this.name = name;
    }
    public String getTitle() {
        return this.title;
    }
    public int getYear() {
        return this.year;
    }
    public Author getName() {
        return this.name;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
