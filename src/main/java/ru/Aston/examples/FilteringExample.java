package ru.Aston.examples;

import ru.Aston.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FilteringExample extends Example {

    public List<Person> getPeopleWithAgeAboveRequired(final int requiredAge) {
        Predicate<Person> agePredicate = person -> person.age() > requiredAge;
        return people.stream().filter(agePredicate).toList();
    }

    public List<Person> getPeopleByGender(String gender) {
        Predicate<Person> genderPredicate = person -> person.gender().equals(gender);
        return people.stream().filter(genderPredicate).toList();
    }

    public Optional<Person> findByEmail(String email) {
        Predicate<Person> emailPredicate = person -> person.email().equals(email);
        return people.stream().filter(emailPredicate).findFirst();
    }

}
