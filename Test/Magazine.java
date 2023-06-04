public class Magazine extends LibraryItem {
    private String issueNumber;
    private String publicationMonth;

    public Magazine(String title, String issueNumber, String publicationMonth) {
        super(title);
        this.issueNumber = issueNumber;
        this.publicationMonth = publicationMonth;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public String getPublicationMonth() {
        return publicationMonth;
    }

    public void borrow() {
        System.out.println(getTitle()+" - "+ getIssueNumber() + " - "+ getPublicationMonth()+"  is borrowed");
    }

    @Override
    public String toString() {
        return getTitle() + " - "+ getIssueNumber() + " - " + getPublicationMonth();
    }
}
