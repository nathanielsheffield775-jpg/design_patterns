package state.src.state;

public class SecondGradeState extends State {

    public SecondGradeState(VocabularyList vocabularyList) {
        super(vocabularyList);
        this.words = FileReader.getWords("second.txt");
    }

    @Override
    public void increaseGrade() {
        vocabularyList.setState(vocabularyList.getThirdGradeState());
        System.out.println("You are now in third grade.");
    }

    @Override
    public void decreaseGrade() {
        vocabularyList.setState(vocabularyList.getFirstGradeState());
        System.out.println("You are now in first grade.");
    }
}