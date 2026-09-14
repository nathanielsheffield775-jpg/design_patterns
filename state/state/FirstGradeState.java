package state;

public class FirstGradeState extends State {

    /**
     * Constructs a new first grade state instance with the specified parameters.
     *
     * @param vocabularyList list of items
     */
    public FirstGradeState(VocabularyList vocabularyList) {
        super(vocabularyList);
        this.words = FileReader.getWords("first.txt");
    }
    
    /**
     * Increase grades.
     */
    @Override
    public void increaseGrade() {
        vocabularyList.setState(vocabularyList.getSecondGradeState());
        System.out.println("You are now in second grade.");
    }
}