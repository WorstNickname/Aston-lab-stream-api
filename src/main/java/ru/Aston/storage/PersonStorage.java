package ru.Aston.storage;

import com.google.common.io.Resources;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import lombok.SneakyThrows;
import org.apache.commons.io.IOUtils;
import ru.Aston.model.Person;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public final class PersonStorage {

    private static final String RESOURCE_NAME = "people.json";

    private static PersonStorage instance;

    private final List<Person> people;

    private PersonStorage() {
        people = loadData();
    }

    public static List<Person> getPeople() {
        return getInstance().people;
    }

    private static PersonStorage getInstance() {
        if (instance == null) {
            instance = new PersonStorage();
        }
        return instance;
    }

    @SneakyThrows
    private List<Person> loadData() {
        InputStream inputStream = Resources.getResource(RESOURCE_NAME).openStream();
        String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        Type listType = new TypeToken<ArrayList<Person>>() {
        }.getType();
        return new Gson().fromJson(json, listType);
    }

}
