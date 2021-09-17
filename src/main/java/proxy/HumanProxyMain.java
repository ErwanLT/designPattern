package main.java.proxy;

public class HumanProxyMain {

    public static void main(String[] args) {
        Human human = new ProxyHuman("Erwan");
        human.display();

        System.out.println(" ");
        human.display();
    }
}
