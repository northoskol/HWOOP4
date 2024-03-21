import java.util.ArrayList;
import java.util.List;

public class Library {
    //    private List<LibraryCard> db;
    private final List<LibraryCard> cards;
    private int cardCounter;

    public Library() {
        cards = new ArrayList<>();
        cardCounter = 0;
    }

    void addCardToLibrary(LibraryCard card) {
        card.setNumber(++cardCounter);
        cards.add(card);
    }

    public LibraryCard findBook(String name) {
        for (LibraryCard card: cards) {
            Book book = (Book)card.getBook();
            String title = (String)book.getName();
            if (title.equals(name)) {
                return card;
            }
        }
        return null;
    }

    void issueBook(String name, String readerName) {
        if (findBook(name) != null && !findBook(name).isIssued()) {
            findBook(name).setCustomer(readerName);
            findBook(name).setIssued(true);
        }
    }

    void receiveBook(String name) {
        findBook(name).setIssued(false);
        findBook(name).setCustomer(null);
    }

    void showIssuedBooks() {
        System.out.println("Выданы книги:");
        for (LibraryCard card: cards) {
            if (card.isIssued()) {
                System.out.println(card);
            }
        }
    }


    @Override
    public String toString() {
        return "Library{" +
                "db=" + cards +
//                ", cardCounter=" + cardCounter +
                '}';
    }
}
