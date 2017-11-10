package io.zipcoder.microlabs.arrays;


public class ArrayParty {

    public String printArray(String[] inputArray) {

        String output = "*** Output ***";
        for (String breakfastString : inputArray) {
            output = output + "\n" + breakfastString;

        }
        return output;
    }

    public String lastElement(String[] inputArray) {
        int ArrayLength = inputArray.length;
        String output = "*** Output ***";
        output = output + "\n" + inputArray[ArrayLength - 1];

        return output;

    }

    public String lastButOneOne(String[] inputArray) {
        int ArrayLength = inputArray.length;
        String output = "*** Output ***";
        output = output + "\n" + inputArray[ArrayLength - 2];

        return output;

    }

    public String reverseBreakfastString(String[] inputArray) {

        String output = "*** Output ***";
        for (int i = inputArray.length - 1; i >= 0; i--) {
            output = output + "\n" + inputArray[i];

        }
        return output;
    }

    public boolean isPalindrome(String[] inputArray) {
        int palindromeArray = inputArray.length;
        boolean flag = true;

        for (int i = 0; i < palindromeArray; i++) {
            if (inputArray[i].equalsIgnoreCase(inputArray[palindromeArray - i - 1])) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public boolean isPalindrome2(String[] inputArray) {
        int palindromeArray = inputArray.length;
        boolean flag = true;

        for (int i = 0; i < palindromeArray; i++) {
            if (inputArray[i].equalsIgnoreCase(inputArray[palindromeArray - i - 1])) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public String consecutiveDuplicate(int[] inputArray) {
        String string = "*** Output ***\n" + inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] != inputArray[i - 1]) {
                string += "\n" + inputArray[i];
            }
        }
        return string;
    }

    public String packDuplicates(char[] letters) {
        String string = "*** Output ***\n" + letters[0];
        for (int i = 1; i < letters.length; i++) {
            if (letters[i] == letters[i - 1]) {
                string += letters[i];
            } else {
                string += ", " + letters[i];
            }
        }
        return string;

    }

}
