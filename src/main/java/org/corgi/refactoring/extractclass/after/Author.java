package org.corgi.refactoring.extractclass.after;

public class Author {

    private String authorName;
    private String authorMail;

    public Author(String authorName, String authorMail) {
        this.authorName = authorName;
        this.authorMail = authorMail;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorMail() {
        return authorMail;
    }

    public void setAuthorMail(String authorMail) {
        this.authorMail = authorMail;
    }
}
