package pl.ania;

public class Main {

    public static void main(String[] args) {

        DuplicateCounter duplicateCounter = new DuplicateCounter();
        Count count = new Count();
        TheLongestAndTheShortestWord word = new TheLongestAndTheShortestWord();
        Letters letters = new Letters();
        WordsLength wordsLength = new WordsLength();

//        System.out.println(duplicateCounter.countDuplicates(count.readFile("aaa.txt")));
//        System.out.println(duplicateCounter.returnDuplicateList(count.readFile("Words.txt")));


        Average average = new Average();
        System.out.println(average.countAverage(count.readFile("Words.txt")));
        System.out.println("-----------------------------------");
//        System.out.println(word.readTheShortestWord(count.readFile("aaa.txt")));
        System.out.println(wordsLength.sortWords(count.readFile("Words.txt")));
        System.out.println(wordsLength.sortWords(count.readFile("aaa.txt")));


    }
}
