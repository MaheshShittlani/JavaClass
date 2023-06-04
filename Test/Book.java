public class Book extends LibraryItem{
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        super(title);
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void borrow() {
        System.out.println(getTitle()+" - "+ getAuthor() + " - "+ getPublicationYear()+"  is borrowed");
    }

    public void returnBook() {
        System.out.println(getTitle()+" - "+ getAuthor() + " - "+ getPublicationYear()+"  is returned");
    }

    @Override
    public String toString() {
        return getTitle()+" - "+ getAuthor()+ " - "+ getPublicationYear();
    }
}
