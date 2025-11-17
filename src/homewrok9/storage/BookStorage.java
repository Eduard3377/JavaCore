package homewrok9.storage;

import homewrok9.library.model.Book;


public class BookStorage {
    private Book[] books = new Book[10];
    private int size = 0;

    public boolean add(Book book) {
        for (int i = 0; i < size; i++) {
            if (book.getId().equals(books[i].getId())) {
                System.out.println("Book with given id already exists. Please try with another id");
                return false;
            }
        }

        if (size == books.length) {
            extand();
        }
        books[size++] = book;
        return true;
    }

    private void extand() {
        Book[] tmp = new Book[size + 10];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;
    }

    public void print() {

        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(books[i]);
            }
        }
    }

    public Book getBookByMaxPrice() {
        double price = 0;
        int maxIndex = -1;
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() > price) {
                price = books[i].getPrice();
                maxIndex = i;
            }
        }
        return books[maxIndex];
    }

    public void deleteBookById(String id) {
        int counter = 0;
        Book[] newBooksArray = new Book[books.length];
        for (int i = 0; i < size; i++) {
            if (books[i] != null && !books[i].getId().equals(id)) {
                newBooksArray[counter] = books[i];
                counter++;
            } else if (books[i] != null && books[i].getId().equals(id)) {
                size--;
            }
        }
        System.arraycopy(books, 0, newBooksArray, 0, counter);


    }

    public void searchByPriceRange(double minPrice, double maxPrice) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            double price = books[i].getPrice();
            if (price >= minPrice && price <= maxPrice) {
                System.out.println(books[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found in this price range.");
        }
    }


}

