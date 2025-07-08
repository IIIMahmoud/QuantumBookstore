public class Inventory {
    private Book[] books;
    private int count;

    public Inventory() {
        books = new Book[1000];
        count = 0;
    }

    public void addBook(Book book) {
        if (count >= books.length) {
            System.out.println("Quantum book store: Inventory is full.");
            return;
        }
        books[count++] = book;
        System.out.println("Quantum book store: Book added -> " + book.title);
    }

    public void removeOutdatedBooks(int maxYearsOld) {
        int currentYear = java.time.Year.now().getValue();

        for (int i = 0; i < count; i++) {
            if (currentYear - books[i].getYear() > maxYearsOld) {
                System.out.println("Quantum book store: Removed outdated book -> " + books[i].title);

                // shift all remaining elements left
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }

                books[--count] = null; // clean last slot
                i--; // recheck current index after shifting
            }
        }
    }

    public void buyBook(String isbn, int quantity, String email, String address) throws Exception {
        for (int i = 0; i < count; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                books[i].buy(quantity, email, address);
                return;
            }
        }
        throw new Exception("Quantum book store: Book with ISBN " + isbn + " not found");
    }
}
