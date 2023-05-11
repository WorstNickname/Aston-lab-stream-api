package ru.Aston.examples;

import ru.Aston.model.Person;

import java.util.Comparator;
import java.util.List;

public class SortingExample extends Example {

    private static Comparator<Person> ageComparator = Comparator.comparing(Person::age);
    private static Comparator<Person> idComparator = Comparator.comparing(Person::id);

    public List<Person> sort(Comparator<Person> comparator) {
        return people.stream().sorted(comparator).toList();
    }

    public static void main(String[] args) {
        var sortingExample = new SortingExample();
        var sorted = sortingExample.sort(ageComparator);
    }

}
