package dtos;

import entities.Flag;

public class FlagDTO {
    private Long id;
    private String countryName;
    private Long answered;
    private Long correct;
    private Long incorrect;
    private String flagURL;
    private Boolean isCorrect;

    public FlagDTO(String countryName, Long answered, Long correct, Long incorrect, String flagURL) {
        this.countryName = countryName;
        this.answered = answered;
        this.correct = correct;
        this.incorrect = incorrect;
        this.flagURL = flagURL;
    }
    public FlagDTO(Flag f){
        this.id = f.getId();
        this.countryName = f.getCountryName();
        this.answered = f.getAnswered();
        this.correct = f.getCorrect();
        this.incorrect = f.getIncorrect();
        this.flagURL = f.getFlagURL();
    }


    public void setCorrect(Boolean correct) { isCorrect = correct; }
    public Boolean getIsCorrectCorrect() { return isCorrect; }
    public void setId(Long id) {this.id = id;}
    public void setCountryName(String countryName) {this.countryName = countryName;}
    public void setAnswered(Long answered) {this.answered = answered;}
    public void setCorrect(Long correct) {this.correct = correct;}
    public void setIncorrect(Long incorrect) {this.incorrect = incorrect;}
    public void setFlagURL(String flagURL) {this.flagURL = flagURL;}
    public Long getId() {return id;}
    public String getCountryName() {return countryName;}
    public Long getAnswered() {return answered;}
    public Long getCorrect() {return correct;}
    public Long getIncorrect() {return incorrect;}
    public String getFlagURL() {return flagURL;}


}
