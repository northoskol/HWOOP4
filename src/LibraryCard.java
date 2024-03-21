public class LibraryCard<K, V> {
    private K number;
    private V book;
    private boolean isIssued = false;
    private String customer;
    public LibraryCard(V book, boolean isIssued) {
//        this.number = number;
        this.book = book;
        this.isIssued = isIssued;
    }

    public K getNumber() {
        return number;
    }
    public void setNumber(K number) {
        this.number = number;
    }

    public V getBook() {
        return book;
    }
    public void setBook(V book) {
        this.book = book;
    }

    public boolean isIssued() {
        return isIssued;
    }
    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public String getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        if (!isIssued) {
            return "Карточка " +
                    "номер: " + number +
                    ", " + book;
        } else {
            return "Карточка " +
                    "номер: " + number +
                    ", " + book +
                    ", забрал: " + customer;
        }
    }
}