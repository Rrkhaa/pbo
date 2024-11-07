public class Book {
    private String title;
    private String author; 
    private String isbn;
    public static int totalBooks = 0;
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
    }
    
    public static void displayTotalBooks() {
        System.out.println("Total buku: " + totalBooks);
    }
    
    public static void main(String[] args) {
        // Membuat beberapa objek buku
        Book buku1 = new Book("ayo berbelanja", "simik", "8739279-99");
        Book buku2 = new Book("menamam padi", "udin jono ", "212-212");
        Book buku3 = new Book("pasukan putih", "rifki budi", "52613-871");
        
        // Menampilkan total buku
        Book.displayTotalBooks();
    }
}