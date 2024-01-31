package behavioral.command;

import behavioral.command.actions.ActionListenerCommand;
import behavioral.command.actions.ActionOpen;
import behavioral.command.actions.ActionSave;

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
