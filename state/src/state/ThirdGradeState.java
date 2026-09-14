package state.src.state;

public class ThirdGradeState extends State {

    public ThirdGradeState(VocabularyList vocabularyList) {
        super(vocabularyList);
        this.words = FileReader.getWords("third.txt");
    }

    @Override
    public void decreaseGrade() {
        vocabularyList.setState(vocabularyList.getSecondGradeState());
        System.out.println("You are now in second grade.");
    }
}