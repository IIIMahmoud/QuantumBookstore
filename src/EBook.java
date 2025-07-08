public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, int year, double price, String author, String fileType) {
        super(isbn, title, year, price, author);
        this.fileType = fileType;
    }

    @Override
    public void buy(int quantity, String email, String address) {
        double total = quantity * price;
        System.out.println("Quantum book store: Paid " + total + " for " + quantity + " EBook(s)");
        System.out.println("Quantum book store: Sending ebook to email " + email);
    }
}
