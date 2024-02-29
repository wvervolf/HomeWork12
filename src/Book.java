public class Book {
    private String title;
    private int year;
    private Author name; //Мы могли бы сделать все в этом классе, было бы проще и не было бы необходимости выворачивать один класс через другой

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
    public void setYear(int year) {
        this.year = year;
    }
    public Author getName() {
        return this.name;
    }
}
