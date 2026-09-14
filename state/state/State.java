package state;

import java.util.HashMap;
import java.util.Random;

public class State {
    protected VocabularyList vocabularyList;
    protected HashMap<String, String> words;
    private Random rand;

    /**
     * Constructs a new state instance with the specified parameters.
     *
     * @param vocabularyList list of items
     */
    public State(VocabularyList vocabularyList) {
        this.vocabularyList = vocabularyList;
        this.words = new HashMap<String, String>();
        this.rand = new Random();
    }

    /**
     * Returns the next definition.
     *
     * @return the resulting string
     */
    public String getNextDefinition() {
        String[] definitions = words.keySet().toArray(new String[0]);
        int index = rand.nextInt(definitions.length);
        return definitions[index];
    }

    /**
     * Returns the matching word.
     *
     * @param definition definition
     * @return the resulting string
     */
    public String getMatchingWord(String definition) {
        return words.get(definition);
    }

    /**
     * Increase grades.
     */
    public void increaseGrade() {
        System.out.println("You are already at the highest grade level.");
    }

    /**
     * Decrease grades.
     */
    public void decreaseGrade() {
        System.out.println("You are already at the lowest grade level.");
    }
}