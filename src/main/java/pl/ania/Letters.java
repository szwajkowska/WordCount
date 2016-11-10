package pl.ania;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Letters {
    public int countLetters(List<String> list) {
        return list.stream()
            .mapToInt(String::length)
            .reduce(0, (e1, e2) -> e1 += e2);
    }

    public Map<Character, Long> countEachLetter(List<String> list) {
        return list.stream()
            .flatMapToInt(String::chars)
            .mapToObj(i-> (char)i)
            .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));


    }
}
