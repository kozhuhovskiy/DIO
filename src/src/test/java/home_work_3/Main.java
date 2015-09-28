package home_work_3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        testMergeArray();
        testInnerUnion();
        testOutherUnion();


    }

    public int[] leftUnion(int[] leftArray, int[] rightArray) {


        int[] resultArray = {};
        return resultArray;
    }

    private static void testOutherUnion() {


    }

    private static void testInnerUnion() {

    }

    private static void testMergeArray() {
        int[] leftArray = {1, 2, 66, 44, 22, 55, 11};
        int[] rightArray = {22, 44, 77, 4, 3, 8, 9, 1};

        Arrays.sort(leftArray);
        Arrays.sort(rightArray);
        int countOfFoundedElementsInRightArray = 0;
        int[] buffArray = Arrays.copyOf(leftArray, leftArray.length + rightArray.length);
        for (int rightArrayElement : rightArray) { //  бежим уиклом по каждому элементу масива
            for (int leftArrayElement : leftArray) { // тоже самое
                if (rightArrayElement == leftArrayElement) { // сравниваем схожие элементы в массивах
                    buffArray[leftArray.length + countOfFoundedElementsInRightArray] = rightArrayElement; // если они есть в
                    // правом массиве, то увеличиваем счетчки
                    countOfFoundedElementsInRightArray++;
                }
            }
        }
        System.out.println("Count of founded elements = " + countOfFoundedElementsInRightArray); // найдено одинаковых элементов

        System.out.println("BuffArray after search: " + Arrays.toString(buffArray)); // элементы, которые записались в массив буфера

        int[] resultArray = Arrays.copyOf(buffArray, leftArray.length + countOfFoundedElementsInRightArray);

        System.out.println(resultArray.toString());
    }
}


