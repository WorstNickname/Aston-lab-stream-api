package ru.Aston.examples;

import ru.Aston.model.Person;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class GenerateExample extends Example {

    public List<Person> getRandomPeople(int count) {

        Supplier<Person> randomPerson = () -> {
            Random random = new Random();
            return people.get(random.nextInt(people.size()));
        };

        return Stream.generate(randomPerson).limit(count).toList();
    }

    public static void main(String[] args) {
        var generateExample = new GenerateExample();
        var randomPeople = generateExample.getRandomPeople(5);
        System.out.println(randomPeople.size());
    }

}
