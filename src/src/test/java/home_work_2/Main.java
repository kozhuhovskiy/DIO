package home_work_2;

public class Main {
    public static void main(String[] args) {

            Person mosichuk = new Person();
            Person lyashko = new Person();
        if (mosichuk.equals(lyashko))
        System.out.println("Братки по заднему приводу");
        else
            System.out.println("Дружат семьями");

        Person [] firsArray = {mosichuk,lyashko};
        mosichuk.setPersonPosition(PersonPosition.CHICKEN);
        lyashko.setPersonPosition(PersonPosition.CHIEF);
        Person[] secondArray = {lyashko, mosichuk};
        if (firsArray.equals(secondArray))
            System.out.println("RADIKALU");
        else
            System.out.println("FALE");

    }

}

