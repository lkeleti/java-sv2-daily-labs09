package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {
    public List<String>  shortestWords(List<String> words) {
        int minimum = findShortestLength(words);
        List<String> shortWords = new ArrayList<>();
        for (String word: words) {
            if (word.length() == minimum) {
                shortWords.add(word);
            }
        }
        return shortWords;
    }

    private int findShortestLength(List<String> words) {
        int minimum = words.get(0).length();
        for (String word: words) {
            if (word.length() < minimum) {
                minimum = word.length();
            }
        }
        return minimum;
    }
}
