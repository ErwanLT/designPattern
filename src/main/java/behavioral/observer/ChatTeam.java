package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ChatTeam {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void sendMessage(String message) {
        System.out.println("Message envoyé: " + message);
        notifyObservers(message);
    }

    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
