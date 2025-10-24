package com.design_pattern.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {

    private static final int MAX_HISTORY_SIZE = 10;

    private final Deque<TextMemento> undoStack;
    private final Deque<TextMemento> redoStack;

    public History() {
        this.undoStack = new ArrayDeque<>();
        this.redoStack = new ArrayDeque<>();
    }

    public void save(TextEditor textEditor) {
        String textEditorText = textEditor.getText();
        if (this.undoStack.isEmpty() || !this.undoStack.getFirst().getSavedText().equals(textEditorText)) {
            if (this.undoStack.size() == MAX_HISTORY_SIZE) {
                this.undoStack.removeLast();
            }
            this.undoStack.addFirst(textEditor.save());
            this.redoStack.clear();
        }
    }

    public void undo(TextEditor textEditor) {
        if (!this.undoStack.isEmpty()) {
            if (this.redoStack.size() == MAX_HISTORY_SIZE) {
                this.redoStack.removeLast();
            }
            this.redoStack.addFirst(new TextMemento(textEditor.getText()));
            TextMemento textMemento = this.undoStack.removeFirst();
            textEditor.restore(textMemento);
        } else {
            System.out.println("There is nothing to undo");
        }
    }

    public void redo(TextEditor textEditor) {
        if (!this.redoStack.isEmpty()) {
            if (this.undoStack.size() == MAX_HISTORY_SIZE) {
                this.undoStack.removeLast();
            }
            this.undoStack.addFirst(new TextMemento(textEditor.getText()));
            TextMemento textMemento = this.redoStack.removeFirst();
            textEditor.restore(textMemento);
        } else {
            System.out.println("There is nothing to redo");
        }
    }

}
