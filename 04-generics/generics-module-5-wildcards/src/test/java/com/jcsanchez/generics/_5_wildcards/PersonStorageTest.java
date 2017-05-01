package com.jcsanchez.generics._5_wildcards;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jsssn on 01-May-17.
 */
class PersonStorageTest {
    private Partner donDraper = new Partner("Don Draper", 89);
    private Partner bertCooper = new Partner("Bert Cooper", 100);
    private Employee peggyOlson = new Employee("Peggy Olson", 65);

    private File file;
    private PersonSaver saver;
    private PersonLoader loader;

    @Test
    public void savesAndLoadsPerson() throws Exception {
        Person person = new Person("Bob", 20);
        saver.save(person);

        assertEquals(person, loader.load());
    }

    @Test
    public void SavesAndLoadsArrayOfPeople() throws Exception {
        Person[] persons = new Person[2];
        persons[0] = donDraper;
        persons[1] = bertCooper;

        saver.saveAll(persons);

        assertEquals(donDraper, loader.load());
        assertEquals(bertCooper, loader.load());
    }

    @Test
    public void SaveAndLoadListOfPeople() throws Exception {
        List<Partner> persons = new ArrayList<>();
        persons.add(donDraper);
        persons.add(bertCooper);

        saver.saveAll(persons);

        assertEquals(donDraper, loader.load());
        assertEquals(bertCooper, loader.load());
    }

    @Test
    public void LoadsListOfPeople() throws Exception {
        saver.save(donDraper);
        saver.save(peggyOlson);

        List<Person> people = new ArrayList<>();
        loader.loadAll(people);

        assertEquals(donDraper, people.get(0));
        assertEquals(peggyOlson, people.get(1));
    }

    @BeforeEach
    public void setUp() throws Exception {
        file = File.createTempFile("tmp", "people");
        saver = new PersonSaver(file);
        loader = new PersonLoader(file);
    }

    @AfterEach
    public void tearDown() {
        if (file.exists()) {
            file.delete();
        }
    }
}