package pl.ania;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MedianTest {

    @Test
    public void shouldCountMedian() throws Exception {
        //given
        Median median = new Median();
        List<String> list = new ArrayList<>();
        list.add("12311");
        list.add("2111");
        list.add("311");
        list.add("41");
        list.add("5");
        //when
        double word = median.countMedian(list);
        //then
        Assert.assertEquals(3, word, 0.01);
    }
}
