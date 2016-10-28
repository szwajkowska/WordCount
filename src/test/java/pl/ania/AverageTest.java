package pl.ania;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AverageTest {

    @Test
    public void shouldCountAverage() throws Exception {
        //given
        Average average = new Average();
        List<String> list = new ArrayList<>();
        list.add("aaaaa");
        list.add("aaa");
        list.add("a");
        //when
        double count = average.countAverage(list);
        //then
        Assert.assertEquals(3, count, 0.01);
    }
}
