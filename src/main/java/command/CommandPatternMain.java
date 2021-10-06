package main.java.command;

import main.java.command.actions.ActionListenerCommand;
import main.java.command.actions.ActionOpen;
import main.java.command.actions.ActionSave;

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
