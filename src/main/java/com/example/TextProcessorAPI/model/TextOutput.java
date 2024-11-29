package com.example.TextProcessorAPI.model;

public class TextOutput {
    private String cleanPhrase;
    private boolean isWordCountCorrect;

    // Constructor
    public TextOutput(String cleanPhrase, boolean isWordCountCorrect) {
        this.cleanPhrase = cleanPhrase;
        this.isWordCountCorrect = isWordCountCorrect;
    }

    public String getCleanPhrase() {
        return cleanPhrase;
    }

    public void setCleanPhrase(String cleanPhrase) {
        this.cleanPhrase = cleanPhrase;
    }

    public boolean isWordCountCorrect() {
        return isWordCountCorrect;
    }

    public void setWordCountCorrect(boolean wordCountCorrect) {
        isWordCountCorrect = wordCountCorrect;
    }

    @Override
    public String toString() {
        return "TextoOutput{" +
                "cleanPhrase='" + cleanPhrase + '\'' +
                ", isWordCountCorrect=" + isWordCountCorrect +
                '}';
    }
}
