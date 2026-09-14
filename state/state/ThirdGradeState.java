package state;

public class ThirdGradeState extends State {

    /**
     * Constructs a new third grade state instance with the specified parameters.
     *
     * @param vocabularyList list of items
     */
    public ThirdGradeState(VocabularyList vocabularyList) {
        super(vocabularyList);
        this.words = FileReader.getWords("third.txt");
    }

    /**
     * Decrease grades.
     */
    @Override
    public void decreaseGrade() {
        vocabularyList.setState(vocabularyList.getSecondGradeState());
        System.out.println("You are now in second grade.");
    }
}