public class Main {
    public static void main(String[] args) {
        Author author = new Author("Андрей", "Андреев");
        System.out.println("Автора зовут - " + author.getName() + " " + author.getSurname());

        Book book = new Book("Археология", 2010);
        book.setYear(2011);
        System.out.println("Книга называется - " + book.getTitle() + ", она издана в " + book.getYear() + " году.");

        Author authorLiric = new Author(" Сергей", "Пупкин");
        System.out.println("Автора зовут - " + authorLiric.getName() + " " + authorLiric.getSurname());

        Book bookEnglish = new Book("История любви циклопа и дюймовочки", 2005);
        bookEnglish.setYear(2004);
        System.out.println("Книга называется - " + bookEnglish.getTitle() + ", она издана в " + bookEnglish.getYear() + " году.");

        Author authorPhantastic = new Author("Александр", "Длиннохвостов");
        System.out.println("Автора зовут - " + authorPhantastic.getName() + " " + authorPhantastic.getSurname());

        Book bookPhantastic = new Book("Жизнь ихтиандров", 2001);
        System.out.println("Книга называется - " + bookPhantastic.getTitle() + ", она издана в " + bookPhantastic.getYear() + " году.");
    }
}