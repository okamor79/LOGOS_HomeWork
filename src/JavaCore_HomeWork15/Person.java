package JavaCore_HomeWork15;

import java.util.Objects;

public class Person implements ZooClubInterface {
    private String personName;

    public Person() {
    }

    public Person(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public String forWrite() {
        return personName + "=>";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(personName, person.personName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(personName);
    }

    @Override
    public String toString() {
        return "Учасник клубу " + personName;
    }
}
