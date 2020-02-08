package org.corgi.refactoring.extractclass.mutable;


public class Book {

    private String title;
    private String isbn;
    private String price;

    private Author author;

    public Book(String title, String isbn, String price,
                String authorName, String authorMail) {

        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.author = new Author(authorName, authorMail);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    // 받는 쪽에서 Author 클래스의 setter 메서드 사용 불가
    // *ImmutableAuthor 인터페이스는 getter만 존재하므로
    public ImmutableAuthor getAuthor() {
        return this.author;
    }

    public String toXml() {

        String author = tag("author", tag("name", this.author.getName())
                + tag("mail", this.author.getMail()));

        String book = tag("book", tag("title", this.title)
                + tag("isbn", this.isbn) + tag("price", this.price) + author);

        return book;
    }

    private String tag(String element, String content) {

        StringBuffer strBuf = new StringBuffer();
        strBuf.append("<");
        strBuf.append(element);
        strBuf.append(">");
        strBuf.append(content);
        strBuf.append("<");
        strBuf.append(element);
        strBuf.append(">");

        return strBuf.toString();
    }
}
