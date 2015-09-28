package builder_test;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Arrays;

/**
 * Created by Kirill on 23.09.2015.
 */
public class ArrayPersons {

    public static void main(String[] args) {
        Person personVasya = new Person.Builder()
                .firsName("Vasya")
                .phone("04454833333")
                .SecondName("TestSecondName")
                .email("kk@gmail.com").build();

        Person personKirill = new Person.Builder()
                .phone ("0335483333")
                .SecondName("")
                .firsName("")
                .firsName("Kirill").build();

        Person personLilya = new Person.Builder()
                .phone ("0335466683333")
                .SecondName("lilya")
                .firsName("***lilya")
                .firsName("Lilya").build();


  // Попробовать Comparator and Comparable, разница в наследовании и обьявления интерефейсов и не только + google


        Person[] leftArray = new Person[]{personVasya,personKirill};
        Person[] rightArray = new Person[]{personLilya};

        Person[] temp = leftUnion(leftArray, rightArray);
        System.out.println(Arrays.toString(temp));

    }

    private static Person[] leftUnion(Person[] leftArray, Person[] rightArray) {
        Person[] temp = Arrays.copyOf(leftArray, leftArray.length + rightArray.length);
        int index = leftArray.length;
        for (int i = 0; i < rightArray.length; i++) {
            for (int j = 0; j < leftArray.length; j++) {
                if(rightArray[i] == leftArray[j]){
                    temp[index]=rightArray[i];
                    index++;
                    break;
                }

            }

        }
        return temp;
    }
}

