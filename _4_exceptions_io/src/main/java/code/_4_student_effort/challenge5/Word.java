package code._4_student_effort.challenge5;

public class Word {
    private String word;
    private Integer occurrence;

    public String getWord() {
        return word;
    }

    public Integer getOccurrence() {
        return occurrence;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setOccurrence(int occurrence) {
        this.occurrence = occurrence;
    }

    public void increaseOccurence() {
        this.occurrence++;
    }

    public Word(String word) {
        this.word = word;
        this.occurrence = 1;
    }
}
