package state.src.state;

public class FirstGradeState extends State {

    public FirstGradeState(VocabularyList vocabularyList) {
        super(vocabularyList);
        this.words = FileReader.getWords("first.txt");
    }

    @Override
    public void increaseGrade() {
        vocabularyList.setState(vocabularyList.getSecondGradeState());
        System.out.println("You are now in second grade.");
    }
    
}