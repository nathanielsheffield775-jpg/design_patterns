package state;
public class SecondGradeState extends State {

    /**
     * Constructs a new second grade state instance with the specified parameters.
     *
     * @param vocabularyList list of items
     */
    public SecondGradeState(VocabularyList vocabularyList) {
        super(vocabularyList);
        this.words = FileReader.getWords("second.txt");
    }

    /**
     * Increase grades.
     */
    @Override
    public void increaseGrade() {
        vocabularyList.setState(vocabularyList.getThirdGradeState());
        System.out.println("You are now in third grade.");
    }

    /**
     * Decrease grades.
     */
    @Override
    public void decreaseGrade() {
        vocabularyList.setState(vocabularyList.getFirstGradeState());
        System.out.println("You are now in first grade.");
    }
}