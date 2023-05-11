package ru.Aston.examples;

import ru.Aston.model.PersonDTO;

import java.util.List;

public class MapExample extends Example {

    public List<PersonDTO> mapToDto() {
        return people.stream().map(PersonDTO::map).toList();
    }

}
