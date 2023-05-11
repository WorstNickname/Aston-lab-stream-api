package ru.Aston;

import ru.Aston.examples.FilteringExample;

public class ApplicationRunner {

    public static void main(String[] args) {
        var personDao = new FilteringExample();
        var mayBePerson = personDao
                .findByEmail("dbeynon222@rambler.ru")
                .orElseThrow(() -> new RuntimeException("No user with this email!"));
    }

}
