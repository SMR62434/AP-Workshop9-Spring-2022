package org.aut.ce;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordAnalyze extends Data implements Runnable {
    private String name = "";

    public WordAnalyze(String name) {
        this.name = name;
    }

    public void countWord(String str) {
        setOfAllWords.add(str);
        answerToNumberOfAllWords++;
        if (str.length() > answerToLongestWord.length()) {
            answerToLongestWord = str;
        }
        if (str.length() < answerToShortestWord.length() || answerToShortestWord.equals("")) {
            answerToShortestWord = str;
        }
        answerToSumOfAllLengthsOfWords += str.length();
        answerToAverageLengthWord = answerToSumOfAllLengthsOfWords / answerToNumberOfAllWords;
    }

    public void readFile() {
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\Lenovo\\IdeaProjects\\Ap09\\assets\\" + name + ".txt"));
            while (scanner.hasNextLine()) {
                countWord(scanner.nextLine());
            }
            scanner.close();
        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        readFile();
    }
}

