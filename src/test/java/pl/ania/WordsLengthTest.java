package pl.ania;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WordsLengthTest {

    @Test
    public void shouldSortWords() throws Exception {
        //given
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("ab");
        list.add("cd");
        list.add("abc");
        WordsLength words = new WordsLength();
        //when
        Map<Integer, List<String>> map = words.sortWords(list);
        //then
        Assert.assertTrue(map.containsKey(1));
        Assert.assertTrue(map.containsKey(2));
        Assert.assertTrue(map.containsKey(3));
        Assert.assertTrue(map.get(1).contains("a"));
        Assert.assertTrue(map.get(2).contains("ab"));
        Assert.assertTrue(map.get(3).contains("abc"));
    }
}
