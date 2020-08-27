/*
Declare, initalize and print  array of integers, Strings, characters, & booleans:

5 numbers
7 Strings
5 characters
2 booleans
**Note: Arrays class needs to be imported**

Your output should look like below:

//Numbers: [1, 21, 63, 4, 51]
//Strings: [Sunday, Monday, Tuesday, Wednesday, Thursday, Fridat, Saturday]
//Characters:[a, e, i, o, u]
//Booleans:[true, false]

//Process finished with exit code 0


*/


import java.util.Arrays;
import java.util.Scanner;

public class createArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // <datatype> [] <arrayname> = new <datatype>[<size>];
        int[] numberArray = new int[5];
        numberArray[0] = 1;
        numberArray[1] = 21;
        numberArray[2] = 63;
        numberArray[3] = 4;
        numberArray[4] = 51;

        System.out.println(Arrays.toString(numberArray));

        // <datatype> <arrayname> [] = new <datatype>[<size>];
        String stringArray[] = new String[7];
        System.out.println("Please enter the weekdays one by one");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Day #" + (i + 1) + ":");
            stringArray[i] = scanner.nextLine();
        }

        // <datatype> <arrayname> [] = {value1, value2, value3};
        char charArray[] = {'a', 'b', 'c', 'd', 'e'};
//        for (int i = 0; i < charArray.length; i++) {
//            System.out.println(charArray[i] + " ");
//        }
        for (char tempChar : charArray) {
            System.out.println(tempChar);
        }


        boolean boolArray[] = new boolean[3];
        boolArray[0] = true;
        boolArray[1] = false;


//        for (int i = 0; i < charArray.length; i++) {
//            if (charArray[i] == 'c');{
//                System.out.println("The index of 'C' is " + i);
//            }
//       }
    }
}
