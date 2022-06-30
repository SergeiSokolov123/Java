public class Book {
    private final String name;
    private final String author;
    private final short pageCount;
    private final byte numberISBN;

    public Book(String name, String author, short pageCount, byte numberISBN) {
        this.name = name;
        this.author = author;
        this.pageCount = pageCount;
        this.numberISBN = numberISBN;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public short getPageCount() {
        return pageCount;
    }

    public byte getNumberISBNl() {
        return numberISBN;
    }
}
