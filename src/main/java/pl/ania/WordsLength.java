package pl.ania;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordsLength {


    public Map<Integer, List<String>> sortWords(List<String> list) {
        Map<Integer, List<String>> wordsByLength = list.stream()
           . filter(str -> !str.isEmpty())
           . collect(Collectors.groupingBy(String::length));

        wordsByLength
           . forEach((integer, string) -> System.out.format("Liczba liter: %s = %s\n", integer, string));
        return wordsByLength;

    }
}
