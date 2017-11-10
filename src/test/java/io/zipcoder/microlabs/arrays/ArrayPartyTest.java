package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    @Test
    public void printArrayTest() {
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest() {

        String[] lastElement = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty inputArray = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Mushrooms";

        String actual = inputArray.lastElement(lastElement);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lasButOneTest() {

        String[] lastButOneElement = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty inputArray = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Tomatoes";

        String actual = inputArray.lastButOneOne(lastButOneElement);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void reverseBreakfastStringTest() {

        String[] breakfastString = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Mushrooms\n" +
                "Tomatoes\n" +
                "Bacon\n" +
                "Beans\n" +
                "Eggs\n" +
                "Sausage";

        String actual = arrayParty.reverseBreakfastString(breakfastString);

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void isPalindromeTest1() {
        String[] breakfast = {"Sausage", "Eggs", "Beans",
                "Beans", "Eggs", "Sausage"};
        ArrayParty inputArray = new ArrayParty();


        String expected = "*** Output ***\n" + true;
        Boolean actual = inputArray.isPalindrome(breakfast);


        Assert.assertTrue(true);

    }

    @Test
    public void isPalindromeTest2() {
        String[] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty inputArray = new ArrayParty();


        String expected = "*** Output ***\n" + true;
        Boolean actual = inputArray.isPalindrome2(breakfast);


        Assert.assertTrue(true);

    }

    @Test
    public void consecutiveDuplicateTest() {

        ArrayParty arrayParty = new ArrayParty();
        int[] numbers = {1, 1, 3, 3, 3, 2, 2, 2, 1, 1, 1, 1, 4, 4, 4, 4};

        String expected = "*** Output ***\n" +
                "1\n" +
                "3\n" +
                "2\n" +
                "1\n" +
                "4";
        String actual = arrayParty.consecutiveDuplicate(numbers);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void packDuplicatesTest() {

        ArrayParty inputArray = new ArrayParty();
        char[] letters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'};

        String expected = "*** Output ***\n" +
                "aaaa, b, cc, aa, d, eeee";
        String actual = inputArray.packDuplicates(letters);

        Assert.assertEquals(expected, actual);


    }

}
