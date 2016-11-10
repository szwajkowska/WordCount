package pl.ania;

import java.util.List;
import java.util.stream.Collectors;

public class Average {
    public double countAverage(List<String> list) {
//        int count = 0;

        return list.stream()
            .mapToInt(listElements -> listElements.length())
            .average()
            .getAsDouble();




//        for (String word : list) {
//            count += word.length();
//
//        }
//        return (double)count / list.size();
    }

}
























//        return list.stream()
//            .mapToInt(String::length)
//            .average()
//            .getAsDouble();
