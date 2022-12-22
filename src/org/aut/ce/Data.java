package org.aut.ce;

import java.util.*;

public class Data {
    public static int answerToNumberOfAllWords = 0;
    public static String answerToLongestWord = "";
    public static String answerToShortestWord = "";
    public static int answerToSumOfAllLengthsOfWords = 0;
    public static int answerToAverageLengthWord = 0;
    public static Set<String> setOfAllWords = new HashSet<String>();

    public static void showAnswers() {
        System.out.println("Words Count is " + answerToNumberOfAllWords + " and word counts without repetition is " + setOfAllWords.size());
        System.out.println("Longest word is " + answerToLongestWord + " and its length is " + answerToLongestWord.length());
        System.out.println("Shortest word is " + answerToShortestWord + " and its length is " + answerToShortestWord.length());
        System.out.println("All words average length is " + answerToAverageLengthWord);
    }
}
