package home_work_2;

public class Person {
        private  PersonPosition personPosition;

    public void setPersonPosition(PersonPosition personPosition) {
        this.personPosition = personPosition;
    }

    public PersonPosition getPersonPosition() {
        return personPosition;
    }

    private final String career = "ukrainian clown";

    public String getCareer() {
        return career;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public Person() {
    }

    private final String politicalParty = "Na vily Lyashko";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!career.equals(person.career)) return false;
        if (!politicalParty.equals(person.politicalParty)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = career.hashCode();
        result = 31 * result + politicalParty.hashCode();
        return result;
    }
}