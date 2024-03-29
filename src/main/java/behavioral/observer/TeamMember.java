package behavioral.observer;

class TeamMember implements Observer {
    private String name;
    private ChatTeam chatTeam;

    public TeamMember(String name, ChatTeam chatTeam) {
        this.name = name;
        this.chatTeam = chatTeam;
    }

    public void joinChat() {
        chatTeam.addObserver(this);
        System.out.println(name + " a rejoint le chat d'équipe.");
        update("Bienvenue dans le chat d'équipe !");
    }

    public void leaveChat() {
        chatTeam.removeObserver(this);
        System.out.println(name + " a quitté le chat d'équipe.");
    }

    public void sendMessage(String message) {
        chatTeam.sendMessage(name + ": " + message);
    }

    @Override
    public void update(String message) {
        if (!message.startsWith(name)) {
            System.out.println(message);
        }
    }
}
