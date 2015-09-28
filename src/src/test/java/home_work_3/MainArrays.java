package home_work_3;

import java.util.Arrays;

public class MainArrays {


    public static void main(String[] args) {
        testPositive();
        testLeftArrayIsEmpty();
        testLeftArrayIsNull();

    }

    private static void testPositive() {
        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedArrays = {1, 5, 4, 23, 65, 32, 78, 5, 4, 1, 32, 5};

        System.out.println("LeftArray: " + Arrays.toString(leftArray));
        System.out.println("RightArray: " + Arrays.toString(rightArray));

        MainArrays main = new MainArrays();  // пока не ясно
        int[] returnValue = main.leftUnion(leftArray, rightArray);

        System.out.println("ReturnValue: " + Arrays.toString(returnValue));
        System.out.println("ExpectedArrays: " + Arrays.toString(expectedArrays));
    }

    private static void testLeftArrayIsEmpty() {
        int[] leftArray = {};
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedArrays = {};

        System.out.println("LeftArray: " + Arrays.toString(leftArray));
        System.out.println("RightArray: " + Arrays.toString(rightArray));

        MainArrays main = new MainArrays();
        int[] returnValue = main.leftUnion(leftArray, rightArray); /*возвращаемое значение через маин метод класса*/

        System.out.println("ReturnValue: " + Arrays.toString(returnValue));
        System.out.println("ExpectedArrays: " + Arrays.toString(expectedArrays));
    }

    private static void testLeftArrayIsNull() {
        int[] leftArray = null;
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedArrays = {};

        System.out.println("LeftArray: " + Arrays.toString(leftArray));
        System.out.println("RightArray: " + Arrays.toString(rightArray));

        MainArrays main = new MainArrays();
        int[] returnValue = main.leftUnion(leftArray, rightArray);

        System.out.println("ReturnValue: " + Arrays.toString(returnValue));
        System.out.println("ExpectedArrays: " + Arrays.toString(expectedArrays));
    }

    public int[] leftUnion(int[] leftArray, int[] rightArray) {

        int[] buffArray = Arrays.copyOf(leftArray, leftArray.length + rightArray.length); // копируем в баффаррей все что находится в
        //левоммассиве + длина правого и левого

        System.out.println("BuffArray: " + Arrays.toString(buffArray));
        int countOfFoundedElementsInRightArray = 0;  // счетчик

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

        return resultArray;
    }
}