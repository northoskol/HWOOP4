public class Main {
    public static void main(String[] args) {
        Book<String> b1 = new Book<>("Война и мир", "Л.Н.Толстой");
        Book<String> b2 = new Book<>("Бег", "М.А.Булгаков");
        Book<String> b3 = new Book<>("Е. Онегин", "А.С.Пушкин");
        Book<String> b4 = new Book<>("Приключения Незнайки", "Н.Носов");
        System.out.println(b3);

        LibraryCard<Integer, Book> card1 = new LibraryCard<>(b1, false);
        LibraryCard<Integer, Book> card2 = new LibraryCard<>(b2, false);
        LibraryCard<Integer, Book> card3 = new LibraryCard<>(b3, false);
        LibraryCard<Integer, Book> card4 = new LibraryCard<>(b4, false);
        System.out.println(card1);

        Library library = new Library();
        library.addCardToLibrary(card1);
        library.addCardToLibrary(card2);
        library.addCardToLibrary(card3);
        library.addCardToLibrary(card4);
        System.out.println(library);


        library.issueBook("Приключения Незнайки", "Петров");
        library.issueBook("Бег", "Баширов");
        library.showIssuedBooks();
    }
}
