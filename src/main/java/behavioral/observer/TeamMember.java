package behavioral.observer;

public class TeamMember implements Observer{
    private final String name;
    private final ChatTeam chatTeam;

    public TeamMember(String name, ChatTeam chatTeam) {
        this.name = name;
        this.chatTeam = chatTeam;
    }

    public void joinChat() {
        chatTeam.addObserver(this);
        System.out.println(name + " a rejoint le chat d'équipe.");
    }

    public void leaveChat() {
        chatTeam.removeObserver(this);
        System.out.println(name + " a quitté le chat d'équipe.");
    }

    @Override
    public void update(String message) {
        System.out.println(name + " a reçu un nouveau message: " + message);
    }
}
