package ru.Aston.examples;

import java.util.stream.Collectors;

public class JoiningExample extends Example{

    public void joiningStringsWithStream() {
        var result = people.stream()
                .limit(4)
                .map(person -> (person.firstName() + " " + person.lastName()))
                .collect(Collectors.joining(" | ", "Result: ", " ."));
        System.out.println(result);
    }

    public static void main(String[] args) {
        var joiningExample = new JoiningExample();
        joiningExample.joiningStringsWithStream();
    }

}
