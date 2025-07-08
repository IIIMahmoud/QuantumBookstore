public class PaperBook extends Book {//inheritance
    private int stock;

    public PaperBook(String isbn, String title, int year, double price, String author, int stock) {
        super(isbn, title, year, price, author);
        this.stock = stock;
    }

    @Override //polymorphism
    public void buy(int quantity, String email, String address) throws Exception {
        if (quantity > stock) {
            throw new Exception("Quantum book store: Not enough stock for ISBN: " + isbn);
        }
        stock -= quantity;
        double total = quantity * price;
        System.out.println("Quantum book store: Paid " + total + " for " + quantity + " Paper book(s)");
        System.out.println("Quantum book store: Shipping to address " + address);
    }
}
