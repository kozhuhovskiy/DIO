package builder_test;

/**
 * Created by Kirill on 23.09.2015.
 */
public class Person {

    private final String firstName;
    private final String SecondName;
    private final String email;
    private final String phone;

    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.SecondName = builder.SecondName;
        this.email = builder.email;
        this.phone = builder.phone;

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", SecondName='" + SecondName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!SecondName.equals(person.SecondName)) return false;
        if (!email.equals(person.email)) return false;
        if (!firstName.equals(person.firstName)) return false;
        if (!phone.equals(person.phone)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + SecondName.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + phone.hashCode();
        return result;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public static class Builder {

        private String firstName;
        private String SecondName;
        private String email;
        private String phone;

        public Builder() {

        }

        public Builder(Person original) {


            this.firstName = original.firstName;
            this.SecondName = original.SecondName;
            this.email = original.email;
            this.phone = original.phone;


        }

        public Builder firsName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder SecondName(String SecondName) {
            this.SecondName = SecondName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.firstName = firstName;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }

    public String [] Persons (){

    return null;
    }
}


