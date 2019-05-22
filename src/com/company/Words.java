package com.company;

public class Words {
    private String word;
    private String translation;
    private String opposite;

    public Words(String word, String translation, String opposite) {
        this.word = word;
        this.translation = translation;
        this.opposite = opposite;
    }

    public String getWord() {
        return word;
    }
    public String getTranslation() {
        return translation;
    }
    public String getOpposite() {
        return opposite;
    }

    public void setWord(String word) {
        this.word = word;
    }
    public void setTranslation(String translation) {
        this.translation = translation;
    }
    public void setOpposite(String opposite) {
        this.opposite = opposite;
    }
    @Override
    public String toString() {
        return "-----------------------------------" +
               "\n| The word is :  <" + this.word +">" +
               "\n| Translation of <" + this.word + "> = " + this.translation +
               "\n| Opposite    of <" + this.word + "> = " + this.opposite +
               "\n-----------------------------------";
    }
}
