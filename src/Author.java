public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) { // Это метод, Что означает Аутор тип или название метода?
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
}
