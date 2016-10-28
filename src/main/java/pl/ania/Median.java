package pl.ania;

import java.util.Collections;
import java.util.List;

public class Median {

    MyComparator compalator = new MyComparator();

    public double countMedian(List<String> list) {
        Collections.sort(list, compalator);
        int middle = list.size()/2;
        if (list.size()%2 == 1){
            return list.get(middle).length();
        }
        else {
            return (list.get(middle).length() + list.get(middle + 1).length() /2.0);
        }

    }
}
