package pl.ania;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LettersTest {

    @Test
    public void shouldCountLetters() throws Exception {
        //given
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("bb");
        list.add("ccc");
        Letters letters = new Letters();
        //when
        int count = letters.countLetters(list);
        //then
        Assert.assertTrue(count == 6);

    }

    @Test
    public void shouldCountEachLetter() throws Exception {
        //given
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("bb");
        list.add("ccc");
        Letters letters = new Letters();
        //when
        Map<Character, Long> map = letters.countEachLetter(list);
        //then
//        Assert.assertTrue(map.containsKey("a"));
//        Assert.assertTrue(map.containsKey("b"));
//        Assert.assertTrue(map.containsKey("c"));
        Assert.assertTrue(map.get('a')==(1));
//        Assert.assertTrue(map.get('b').equals(2));
//        Assert.assertTrue(map.get('c').equals(3));
    }
}
