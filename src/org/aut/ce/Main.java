package org.aut.ce;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        WordAnalyze[] words = new WordAnalyze[21];
        for (int i = 1; i <= 20; i++) {
            words[i] = new WordAnalyze("file_" + i);
        }
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        for (int i = 1; i <= 20; i++) {
            executorService.execute(words[i]);
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Data.showAnswers();
    }
}
