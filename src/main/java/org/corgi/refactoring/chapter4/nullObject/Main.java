package org.corgi.refactoring.chapter4.nullObject;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person(new Label("Alice"), new Label("alice@example.com")));
        people.add(new Person(new Label("Bobby"), new Label("bobby@example.com")));
        people.add(new Person(new Label("Chris")));

        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
