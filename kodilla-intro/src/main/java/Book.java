public class Book {

    private String author;
    private String tittle;

    public  Book (String author,String tittle) {
        this.tittle=tittle;
        this.author=author;
    }

    public static void main(String[] args) {
        Book book = new Book(" Robert C. Martin ", " Clean Code ");
        System.out.println(book.author + book.tittle);

    }

}
