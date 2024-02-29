public class Main {
    public static void main(String[] args) {
        Author author = new Author("Андрей", "Андреев");//Оставил строку чисто для себя, поразбирать, че откуда берется
        System.out.println("Автора зовут - " + author.getName() + " " + author.getSurname());//Оставил строку чисто для себя, поразбирать, че откуда берется

        Author aa = new Author("Андрей", "Андреев");
        Book book = new Book("Археология", 2010, aa);
        book.setYear(2011);
        System.out.println("Книга называется - " + book.getTitle() + ", она издана в " + book.getYear() + " году. А автора этой книги зовут " + author.getName() + " " + author.getSurname());

        Author authorLiric = new Author(" Сергей", "Пупкин");//Оставил строку чисто для себя, поразбирать, че откуда берется
        System.out.println("Автора зовут - " + authorLiric.getName() + " " + authorLiric.getSurname());//Оставил строку чисто для себя, поразбирать, че откуда берется

        Author sp = new Author("Сергей", "Пупкин");
        Book bookEnglish = new Book("История любви циклопа и дюймовочки", 2005, sp);
        bookEnglish.setYear(2004);
        System.out.println("Книга называется - " + bookEnglish.getTitle() + ", она издана в " + bookEnglish.getYear() + " году. А автора этой книги зовут " + authorLiric.getName() + " " + authorLiric.getSurname());

        Author authorPhantastic = new Author("Александр", "Длиннохвостов"); //Оставил строку чисто для себя, поразбирать, че откуда берется
        System.out.println("Автора зовут - " + authorPhantastic.getName() + " " + authorPhantastic.getSurname());//Оставил строку чисто для себя, поразбирать, че откуда берется

        Author ad = new Author("Александр", "Длиннохвостов");
        Book bookPhantastic = new Book("Жизнь ихтиандров", 2001, ad);
        System.out.println("Книга называется - " + bookPhantastic.getTitle() + ", она издана в " + bookPhantastic.getYear() + " году. А автора этой книги зовут " + authorPhantastic.getName() + " " + authorPhantastic.getSurname());
    }
}