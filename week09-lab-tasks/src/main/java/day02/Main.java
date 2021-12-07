package day02;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringLists stringLists = new StringLists();
        List<String> shortWords;
        shortWords = stringLists.shortestWords(Arrays.asList("aaa", "aa", "bb",  "cccc", "dd"));
        System.out.println(shortWords.size());
    }
}
