package org.corgi.refactoring.chapter4.nullobject;

public class Person {

    private final Label name;
    private final Label mail;

    public Person(Label name, Label mail) {
        this.name = name;
        this.mail = mail;
    }

    public Person(Label name) {
        this(name, Label.newNull());
    }

    public void display() {
        name.display();
        mail.display();
    }

    public String toString() {

        StringBuffer strBuf = new StringBuffer();
        strBuf.append(String.format("[Person : name = %s, ", name));
        strBuf.append(String.format("mail = %s]", mail));

        return strBuf.toString();
    }
}
