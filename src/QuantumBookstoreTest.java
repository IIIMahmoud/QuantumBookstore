public class QuantumBookstoreTest {
    public static void main(String[] args) {
        try {
            Inventory inv = new Inventory();

            PaperBook p1 = new PaperBook("111", "Book 1", 2020, 200.0, "mahmoud mohr", 5);
            EBook e1 = new EBook("222", "Book 2", 2023, 100.0, "samir", "PDF");
            ShowcaseBook s1 = new ShowcaseBook("333", "Book 3", 2000, 0.0, "Abdo ");

            inv.addBook(p1);
            inv.addBook(e1);
            inv.addBook(s1);

            inv.removeOutdatedBooks(10); // remove older than 10 years

            inv.buyBook("111", 2, "mahmoud.ahmed@email.com", "Giza");
            inv.buyBook("222", 1, "samir@email.com", "alex");
            inv.buyBook("333", 1, "abdo@gmail.com", "Cairo");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
