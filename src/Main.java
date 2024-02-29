public class Main {
    public static void main(String[] args) {
        Author aa = new Author("Морган", "Фримэн");
        Book book = new Book("Сквозь кротовую нору", 2010, aa);
        book.setYear(2011);
        System.out.println("Книга называется - " + book.getTitle() + ", она издана в " + book.getYear() + " году. А автора этой книги зовут " + aa.getName() + " " + aa.getSurname());

        Author sp = new Author("Анна", "Феминисткова");
        Book bookEnglish = new Book("Романтическая история любви молодого олигарха и деревенской проститутки", 2005, sp);
        bookEnglish.setYear(2004);
        System.out.println("Книга называется - " + bookEnglish.getTitle() + ", она издана в " + bookEnglish.getYear() + " году. А автора этой книги зовут " + sp.getName() + " " + sp.getSurname());

        Author ad = new Author("Николай", "Дроздов");
        Book bookPhantastic = new Book("В мире животных", 2001, ad);
        System.out.println("Книга называется - " + bookPhantastic.getTitle() + ", она издана в " + bookPhantastic.getYear() + " году. А автора этой книги зовут " + ad.getName() + " " + ad.getSurname());
    }
}