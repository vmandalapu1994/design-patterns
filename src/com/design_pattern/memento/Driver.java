package com.design_pattern.memento;

public class Driver {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.type("Hello");

        History history = new History();
        history.save(textEditor);
        System.out.println(textEditor.getText());

        textEditor.type(" World");
        history.save(textEditor);
        System.out.println(textEditor.getText());

        textEditor.type(" Hyderabad");
        history.undo(textEditor);
        System.out.println(textEditor.getText());

        history.redo(textEditor);
        System.out.println(textEditor.getText());

        history.undo(textEditor);
        System.out.println(textEditor.getText());
    }

}
