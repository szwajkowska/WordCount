package pl.ania;

import java.util.ArrayList;
import java.util.List;

public class TheLongestAndTheShortestWord {

    public List<String> readTheLongestWord(List<String> list) {
        List<String> longWords = new ArrayList<>();
        String longestWord = null;
        for (String word : list) {
            if (longestWord == null || word.length() > longestWord.length()) {
                longWords.clear();
                longWords.add(word);
                longestWord = word;

            }
            else if (word.length() == longestWord.length()){
                longWords.add(word);
            }

        }
        return longWords;

    }

    public List<String> readTheShortestWord(List<String> list) {
        List<String> shortWords = new ArrayList<>();
        String shortestWord = null;
        for (String word : list) {
            if (shortestWord == null || word.length() < shortestWord.length()) {
                shortWords.clear();
                shortWords.add(word);
                shortestWord = word;

            }
            else if (word.length() == shortestWord.length()){
                shortWords.add(word);
            }

        }
        return shortWords;

    }


}
