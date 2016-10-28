package pl.ania;

public class Main {

    public static void main(String[] args) {

        DuplicateCounter duplicateCounter = new DuplicateCounter();
        Count count = new Count();
        TheLongestAndTheShortestWord word = new TheLongestAndTheShortestWord();

//        System.out.println(duplicateCounter.countDuplicates(count.readFile("aaa.txt")));
//        System.out.println(duplicateCounter.returnDuplicateList(count.readFile("Words.txt")));
        System.out.println(word.readTheShortestWord((count.readFile("Words.txt"))));
    }
}
