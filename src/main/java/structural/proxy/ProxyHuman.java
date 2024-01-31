package structural.proxy;

public class ProxyHuman implements Human {

    private RealHuman human;
    private String name;

    public ProxyHuman(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void display() {
        if (human == null){
            human = new RealHuman(name);
        }
        human.display();
    }
}
