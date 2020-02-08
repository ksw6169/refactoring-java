package org.corgi.refactoring.chapter6.extractclass.mutable;

public class Author implements ImmutableAuthor {

    private String name;
    private String mail;

    public Author(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
