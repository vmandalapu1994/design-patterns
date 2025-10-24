package com.design_pattern.memento;

public class TextMemento {
    private final String text;

    public TextMemento(String text) {
        this.text = text;
    }

    public String getSavedText() {
        return text;
    }
}
