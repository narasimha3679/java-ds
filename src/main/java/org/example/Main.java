package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] input = {"a", "c", "d", "a", "e", "c", "a"};
        String str = "The quick brown fox jumps Over the lazy dog";
//        printStar();
//        returnDuplicates(input);
//        findDuplicatesInArray(input);
//        numberOfVowels(str);
//        reverseString(str);
        findSecondLargestNumber(new int[]{1, 77, 85, 99, 2, 0, 7});
    }

    static void printStar() {
        // take input
// loop though number of times as level
// start with level-1 spaces and 1 star
// decrease spaces and increase stars
        int level = 5; // Number of rows

        for (int i = 1; i <= level; i++) { // loop that decides level
            for (int j = 1; j <= level - i; j++) { //this will produce spaces
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) { // this will create stars
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static String[] returnDuplicates(String[] input) {


        List<String> tempArrayList = new ArrayList<>();

        for (int i = 1; i <= input.length; i++) {
            tempArrayList.add(input[input.length - i]);
            System.out.println(input[input.length - i]);
        }

        return tempArrayList.toArray(new String[input.length]);
    }

    static void findDuplicatesInArray(String[] input) {

        Set<String> unique = new HashSet<>();
        Set<String> duplicate = new HashSet<>();

        for (String s : input) {
            if (!unique.add(s)) {
                duplicate.add(s);
            }
        }

        for (String s : duplicate) {
            System.out.println(s);
        }
    }

    static void numberOfVowels(String input) {

        String vowels = "aeiouAEIOU";
        int count = 0;
        Set<Character> unique = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                unique.add(Character.toLowerCase(input.charAt(i)));
                count++;
            }
        }

        System.out.println(count);

        for (char c : unique) {
            System.out.println(c);
        }
    }

    static void reverseString(String input) {
        char temp;

        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {

            temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        String output = new String(chars);

        System.out.println(output);
    }

    static void findSecondLargestNumber(int[] input) {

        TreeSet<Integer> orderedSet = new TreeSet<>();

        for (int i : input) {
            orderedSet.add(i);
        }

        Iterator<Integer> descIterator = orderedSet.descendingIterator();
        descIterator.next();
        System.out.println(descIterator.next());
    }
}


