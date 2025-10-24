package com.design_pattern.memento;

public class TextEditor {

    private String text = "";

    public void type(String newText) {
        this.text += newText;
    }

    public TextMemento save() {
        return new TextMemento(this.text);
    }

    public void restore(TextMemento textMemento) {
        this.text = textMemento.getSavedText();
    }

    public String getText() {
        return this.text;
    }

}
