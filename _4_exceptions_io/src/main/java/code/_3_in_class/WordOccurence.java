package code._3_in_class;

public class WordOccurence {
    private String word;
    private Integer occurrence;

    public WordOccurence(String word) {
        this.word = word;
        this.occurrence = 1;
    }

    public String getWord() {
        return word;
    }

    public Integer getOccurence() {
        return occurrence;
    }

    public void increaseOccurence() {
        this.occurrence++;
    }
}
