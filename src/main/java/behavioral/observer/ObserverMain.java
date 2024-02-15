package behavioral.observer;

public class ObserverMain {

    public static void main(String[] args){
        ChatTeam chatTeam = new ChatTeam();

        TeamMember member1 = new TeamMember("Erwan", chatTeam);
        TeamMember member2 = new TeamMember("Alan", chatTeam);

        member1.joinChat();
        member2.joinChat();

        chatTeam.sendMessage("Bonjour à tous !");

        member1.sendMessage("je pense que je vais partir manger");
        member1.leaveChat();

        member2.leaveChat();
    }
}
