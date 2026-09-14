package state;

public class VocabularyList {
    private State state;
    private FirstGradeState firstGradeState;
    private SecondGradeState secondGradeState;
    private ThirdGradeState thirdGradeState;

    /**
     * Constructs a new vocabulary list instance.
     */
    public VocabularyList() {
        firstGradeState = new FirstGradeState(this);
        secondGradeState = new SecondGradeState(this);
        thirdGradeState = new ThirdGradeState(this);
        state = firstGradeState;
    }

    /**
     * Returns the next definition.
     *
     * @return the resulting string
     */
    public String getNextDefinition() {
        return state.getNextDefinition();
    }

    /**
     * Returns the matching word.
     *
     * @param definition definition
     * @return the resulting string
     */
    public String getMatchingWord(String definition) {
        return state.getMatchingWord(definition);
    }

    /**
     * Increase grades.
     */
    public void increaseGrade() {
        state.increaseGrade();
    }

    /**
     * Decrease grades.
     */
    public void decreaseGrade() {
        state.decreaseGrade();
    }

    /**
     * Returns the first grade state.
     *
     * @return the resulting state
     */
    public State getFirstGradeState() {
        return firstGradeState;
    }

    /**
     * Returns the second grade state.
     *
     * @return the resulting state
     */
    public State getSecondGradeState() {
        return secondGradeState;
    }

    /**
     * Returns the third grade state.
     *
     * @return the resulting state
     */
    public State getThirdGradeState() {
        return thirdGradeState;
    }

    /**
     * Sets the state.
     *
     * @param state state
     */
    public void setState(State state) {
        this.state = state;
    }
}