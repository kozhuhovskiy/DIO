package pojo_test;

/**
 * Created by Kirill on 20.09.2015.
 */
public class main_test {
    public static void main(String[] args) {

            Person personFirst = new Person("Alex","Kiev","Lykashenko","male", 34, "Ukraine", JobTitle.ProjectManager);


        System.out.println(args + " *****");
        Integer i = 5000;
        System.out.println("00000---" + i.hashCode());

        }


    }

