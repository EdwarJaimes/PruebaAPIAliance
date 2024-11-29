package com.example.TextProcessorAPI.model;

public class TextInput {
    private int number;
    private String phrase;

    public TextInput(int number, String phrase) {
        this.number = number;
        this.phrase = phrase;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    @Override
    public String toString() {
        return "TextoInput{" +
                "number=" + number +
                ", phrase='" + phrase + '\'' +
                '}';
    }
}
