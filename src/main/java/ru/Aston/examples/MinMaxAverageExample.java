package ru.Aston.examples;

import ru.Aston.model.Person;

import java.util.DoubleSummaryStatistics;

public class MinMaxAverageExample extends Example {

    public int findMinAge() {
        return (int) getStatistics().getMin();
    }

    public int findMaxAge() {
        return (int) getStatistics().getMax();
    }

    public double findAverageAge() {
        return getStatistics().getAverage();
    }

    private DoubleSummaryStatistics getStatistics() {
        return people.stream().mapToDouble(Person::age).summaryStatistics();
    }

}
