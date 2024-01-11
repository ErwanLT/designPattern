package main.java.behavioral.command.actions;

import main.java.behavioral.command.Document;

public class ActionSave implements ActionListenerCommand {

    private Document doc;

    public ActionSave(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.save();
    }
}
