package arrays;

import java.util.Arrays;

/**
 * Created by Kirill on 21.09.2015.
 */
public class ArrayCopy {

        public static void main(String[] args) {
            int[] leftArray = new int[]{1, 5, 4, 23, 65, 32, 78};
            int[] rightArray = new int[]{3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

            int[] temp = Arrays.copyOf(leftArray, leftArray.length + rightArray.length);
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
            System.out.println(Arrays.toString(temp));

        }







        public int[] leftUnion(int[] leftArray, int[] rightArray) {


            return null; }
    }


