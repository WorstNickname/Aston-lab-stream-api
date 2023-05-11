package ru.Aston.model;

import lombok.Builder;

@Builder
public record PersonDTO(Integer id, String name, Integer age) {

    public static PersonDTO map(Person person) {
        return new PersonDTO(
                person.id(),
                person.firstName(),
                person.age());
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}