package ru.Aston.examples;

import ru.Aston.model.Person;
import ru.Aston.storage.PersonStorage;

import java.util.List;

public abstract class Example {

    protected final List<Person> people = PersonStorage.getPeople();

}
