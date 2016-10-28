package pl.ania;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DuplicateCounterTest {

    @Test
    public void shouldReturnAmountOfDuplicate() throws Exception {
        //given
        DuplicateCounter duplicateCounter = new DuplicateCounter();
        List<String> list = new ArrayList<>();
        list.add("Bania");
        list.add("Ania");
        list.add("Frania");
        list.add("Ania");
        //when
        int count = duplicateCounter.countDuplicates(list);
        //then
        Assert.assertEquals(1, count);

    }

    @Test
    public void shouldReturnDuplicateList() throws Exception {
        //given
        DuplicateCounter duplicateCounter = new DuplicateCounter();
        List<String> list = new ArrayList<>();
        list.add("Bania");
        list.add("Ania");
        list.add("Frania");
        list.add("Ania");
        //when
        List<String> result = duplicateCounter.returnDuplicateList(list);
        //then
        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.contains("Ania"));

    }
}
