package pl.ania;

import java.util.List;

public class Average {
    public double countAverage(List<String> list) {
        int count = 0;

//        return list.stream()
//            .mapToInt(String::length)
//            .average()
//            .getAsDouble();
        for (String word : list) {
            count += word.length();

        }
        return (double)count / list.size();
    }

}
