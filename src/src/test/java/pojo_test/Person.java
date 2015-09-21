package pojo_test;

/**
 * Created by Kirill on 20.09.2015.
 */
public class Person implements PersonInterface {
    @Override
    public String toString() {
        return "Person{" +
                "name ='" + name + '\'' +
                ", adress ='" + adress + '\'' +
                ", secondName ='" + secondName + '\'' +
                ", gender ='" + gender + '\'' +
                ", age =" + age +
                ", occupation ='" + occupation + '\'' +
                ", jobTitle =" + jobTitle +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!adress.equals(person.adress)) return false;
        if (!gender.equals(person.gender)) return false;
        if (jobTitle != person.jobTitle) return false;
        if (!name.equals(person.name)) return false;
        if (!occupation.equals(person.occupation)) return false;
        if (!secondName.equals(person.secondName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + adress.hashCode();
        result = 31 * result + secondName.hashCode();
        result = 31 * result + gender.hashCode();
        result = 31 * result + age;
        result = 31 * result + occupation.hashCode();
        result = 31 * result + jobTitle.hashCode();
        return result;
    }

    private String name;
    private String adress;
    private String secondName;
    private String gender;
    private int age;
    private String occupation;
    private JobTitle jobTitle;

    public Person(String name, String adress, String secondName, String gender, int age, String occupation, JobTitle jobTitle) {
        this.name = name;
        this.adress = adress;
        this.secondName = secondName;
        this.gender = gender;
        this.age = age;
        this.occupation = occupation;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
