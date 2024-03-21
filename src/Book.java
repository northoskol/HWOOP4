public class Book<T> {
    private T name;
    private String author;

    public Book(T name, String author) {
        this.name = name;
        this.author = author;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "книга: " + "'" + name + "'" +
                ". Автор: " + author;
    }
}
