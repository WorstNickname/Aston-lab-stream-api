package ru.Aston.examples;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlatMapExample extends Example {

    private static final List<List<String>> names = List.of(
            List.of("Bob", "Alex", "Ivan"),
            List.of("Ted", "Ross", "Tom"),
            List.of("Billy", "Van")
    );

    public List<String> mergeNamesToOneList() {
        return names.stream().flatMap(Collection::stream).toList();
    }

    public List<String> flatMapWithOptionals() {
        List<Optional<String>> optionals = List.of(
                Optional.of("Aston"),
                Optional.of("Software"),
                Optional.of("Company")
        );

        return optionals.stream()
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        var flatMapExample = new FlatMapExample();
        var names = flatMapExample.mergeNamesToOneList();
        var optionalsToString = flatMapExample.flatMapWithOptionals();
        System.out.println(names);
        System.out.println(optionalsToString);
    }

}
