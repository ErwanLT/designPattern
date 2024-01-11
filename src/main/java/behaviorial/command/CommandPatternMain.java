package main.java.behaviorial.command;

import main.java.behaviorial.command.actions.ActionListenerCommand;
import main.java.behaviorial.command.actions.ActionOpen;
import main.java.behaviorial.command.actions.ActionSave;

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
