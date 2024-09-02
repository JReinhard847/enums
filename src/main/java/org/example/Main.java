package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("1", "John", DaysOfWeek.MONDAY, Gender.MALE);
        Person p2 = new Person("2", "Jane", DaysOfWeek.SATURDAY, Gender.FEMALE);
        Person p3 = new Person("3", "Jim", DaysOfWeek.SATURDAY, Gender.MALE);
        PersonRepository repository = new PersonRepository();
        repository.addPerson(p1);
        repository.addPerson(p2);
        repository.addPerson(p3);


        String id = "3";
        Optional<Person> personOptional = repository.findPersonById(id);
        if (personOptional.isPresent()) {
            Person p = personOptional.get();
            System.out.println(p.name() + "'s favourite day is " + p.favouriteDay().getDayTitle());
        } else {
            System.out.println("No person with id " + id + " was found.");
        }
        System.out.println(repository.countPersonsByGender(Gender.MALE));
        System.out.println(repository.getAllPersonsWithFavouriteWeekday(DaysOfWeek.FRIDAY));
    }
}