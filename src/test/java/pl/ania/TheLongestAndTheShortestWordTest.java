package pl.ania;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class TheLongestAndTheShortestWordTest {

    @Test
    public void shouldFindTheLongestWord() throws Exception {
        //given
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("ab");
        list.add("abc");
        list.add("abcd");
        list.add("add");
        list.add("aa");
        TheLongestAndTheShortestWord theLongestAndTheShortestWord = new TheLongestAndTheShortestWord();
        //when
        List<String> words = theLongestAndTheShortestWord.readTheLongestWord(list);
        //then
        assertThat(words, hasItem("abcd"));
        Assert.assertEquals(words.size(), 1);
        Assert.assertTrue(words.contains("abcd"));
    }

    @Test
    public void shouldFindTheShortestWord() throws Exception {
        //given
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("ab");
        list.add("abc");
        list.add("abcd");
        list.add("add");
        list.add("aa");
        TheLongestAndTheShortestWord theLongestAndTheShortestWord = new TheLongestAndTheShortestWord();
        //when
        List<String> words = theLongestAndTheShortestWord.readTheShortestWord(list);
        //then
        Assert.assertTrue(words.contains("a"));
        Assert.assertEquals(1, words.size());
        assertThat(words, hasItem("a"));
    }
}
