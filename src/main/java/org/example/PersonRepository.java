package org.example;

import java.util.*;

public class PersonRepository {
    private final Map<String, Person> personMap;

    public PersonRepository() {
        this.personMap = new HashMap<>();
    }

    public void addPerson(Person person) {
        personMap.put(person.id(), person);
    }

    public Optional<Person> findPersonById(String id) {
        return Optional.ofNullable(personMap.get(id));
    }

    public int countPersonsByGender(Gender gender) {
        int sum = 0;
        for (Person p : personMap.values()) {
            if (p.gender() == gender) {
                sum++;
            }
        }
        return sum;
    }

    public Optional<Person> findPersonByName(String name) {
        for (Person p : personMap.values()) {
            if (p.name().equals(name)) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

    public List<Person> getAllPersonsWithFavouriteWeekday(DaysOfWeek day) {
        List<Person> lst = new ArrayList<>();
        for (Person p : personMap.values()) {
            if (p.favouriteDay() == day) {
                lst.add(p);
            }
        }
        return lst;
    }
}
