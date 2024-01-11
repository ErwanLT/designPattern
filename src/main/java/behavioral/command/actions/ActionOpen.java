package main.java.behavioral.command.actions;

import main.java.behavioral.command.Document;

public class ActionOpen implements ActionListenerCommand {

    private Document doc;

    public ActionOpen(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.open();
    }
}
