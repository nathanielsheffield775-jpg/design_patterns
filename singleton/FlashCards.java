package singleton;

import java.util.ArrayList;
import java.util.Random;

public class FlashCards {
    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words;

    private FlashCards() {
        rand = new Random();
        words = FileReader.getWords();
    }

    public static FlashCards getInstance() {
        if (flashCards == null) {
            flashCards = new FlashCards();
        }
        return flashCards;
    }

    public Word getWord() {
        if (words.isEmpty()) {
            words = FileReader.getWords();
        }

        int index = rand.nextInt(words.size());
        return words.remove(index);
    }
}