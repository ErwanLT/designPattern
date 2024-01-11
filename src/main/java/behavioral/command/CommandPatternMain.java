package main.java.behavioral.command;

import main.java.behavioral.command.actions.ActionListenerCommand;
import main.java.behavioral.command.actions.ActionOpen;
import main.java.behavioral.command.actions.ActionSave;

public class CommandPatternMain {

    public static void main(String[] args) {
        Document doc = new Document();

        ActionListenerCommand clickOpen = new ActionOpen(doc);
        ActionListenerCommand clickSave = new ActionSave(doc);

        MenuOptions menu = new MenuOptions(clickOpen, clickSave);

        menu.clickOpen();
        menu.clickSave();
    }

}
