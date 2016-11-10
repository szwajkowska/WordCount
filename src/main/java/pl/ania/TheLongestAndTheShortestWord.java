package pl.ania;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

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

    public String readTheShortestWordStreamS(List<String> list) {

        return list.stream()
            .filter(str -> !str.isEmpty())
            .reduce("kfdfdgdgdgdf", (word1, word2) ->
            {
                if (word2.length() < word1.length()) return word2;
                return word1;
            });
    }


//    }
    // jak zrobić zeby zwracało listę najkrótszych wyrazów?
    // jak zrobić zeby nie zwracało spacji jako najktrótszego wyrazu?






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
