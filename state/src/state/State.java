package state.src.state;

import java.util.HashMap;
import java.util.Random;

public class State {
    protected VocabularyList vocabularyList;
    protected HashMap<String, String> words;
    private Random rand;

    public State(VocabularyList vocabularyList) {
        this.vocabularyList = vocabularyList;
        this.words = new HashMap<String, String>();
        this.rand = new Random();
    }

    public String getNextDefinition() {
        String[] definitions = words.keySet().toArray(new String[0]);
        int index = rand.nextInt(definitions.length);
        return definitions[index];
    }


    public String getMatchingWord(String definition) {
        return words.get(definition);
    }

    public void increaseGrade() {
        System.out.println("You are already at the highest grade level.");
    }

    public void decreaseGrade() {
        System.out.println("You are already at the lowest grade level.");
    }
}