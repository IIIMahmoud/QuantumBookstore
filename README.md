# 📚 Quantum Bookstore

Welcome to **Quantum Bookstore**, a simple Java-based simulation of an online bookstore supporting multiple types of books:  
- Paper books (shipped by address)  
- EBooks (sent via email)  
- Showcase books (not for sale)

This project was developed as part of the **Fawry N² Dev Slope Challenge #10**.

---

## 📌 Features

- Add books to inventory (with ISBN, title, year, price, author)
- Remove outdated books (older than specific number of years)
- Buy books using ISBN and quantity
  - Paper books reduce stock and get "shipped"
  - EBooks are sent via "email"
  - Showcase books cannot be purchased
- Fully extensible design (easily add new book types)

---

## 🧠 Object-Oriented Concepts Used

- **Abstraction:** Book is an abstract class with a generic `buy()` method
- **Inheritance:** PaperBook, EBook, ShowcaseBook inherit from Book
- **Polymorphism:** Each book type implements `buy()` differently
- **Encapsulation:** Book properties are private/protected with constructor usage

---

## 🗂️ Project Structure
quantumbookstore/
│
├── Book.java # Abstract base class
├── PaperBook.java # Physical book with stock
├── EBook.java # Digital book with filetype
├── ShowcaseBook.java # Demo book (not for sale)
├── Inventory.java # Book inventory using array
└── QuantumBookstoreTest.java # Main class with test cases

---

## 📖 Sample Books Used

| ISBN   | Title   | Author         | Type         |
|--------|---------|----------------|--------------|
| 111    | Book 1  | mahmoud mohr   | PaperBook    |
| 222    | Book 2  | samir          | EBook (PDF)  |
| 333    | Book 3  | Abdo           | ShowcaseBook |

---

## ▶️ How to Run

1. Clone the repo or download the `.zip`
2. Open the project in your favorite IDE (e.g., IntelliJ, Eclipse, VS Code)
3. Compile all `.java` files
4. Run the `QuantumBookstoreTest` class

You will see console outputs simulating book operations, all prefixed with:


---

## 🚫 Notes
- Inventory is implemented using a simple `Book[]` array.
- No actual email/shipping services are implemented — only simulated with `System.out.println()`.

---

## 🛠️ Possible Extensions

- Add support for `AudioBook`, `Magazine`, or `Subscription`
- Save inventory to a file or database
- Build a GUI or Web interface using JavaFX / Spring Boot

---

## 📃 License

This project is for educational purposes only, part of the **Fawry Rise Journey**.


