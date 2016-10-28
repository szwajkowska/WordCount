package pl.ania;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateCounter {

    public int countDuplicates(List<String> list) {
        Set<String> uniqueSet = new HashSet<>(list);
        int duplicatesAmount = 0;

        for (String temp : uniqueSet) {
            int duplicateCount = Collections.frequency(list, temp);
            if (duplicateCount > 1) {
                System.out.println(temp + " : " + duplicateCount);
                duplicatesAmount++;
            }
        }
        return duplicatesAmount;
    }
    public List<String> returnDuplicateList(List<String> list) {
        Set<String> uniqueSet = new HashSet<>(list);
        List<String> duplicateList = new ArrayList<>();
        int duplicatesAmount = 0;

        for (String temp : uniqueSet) {
            int duplicateCount = Collections.frequency(list, temp);
            if (duplicateCount > 1) {
                String duplicate = temp;
                duplicateList.add(duplicate);
                duplicatesAmount++;
            }
        }
        System.out.println("Liczba duplikatów to: " + duplicatesAmount);
        return duplicateList;
    }
}
