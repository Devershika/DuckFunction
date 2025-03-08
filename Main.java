//DEVERSHIKA MOHANE
//23070126032
//AIML A2

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck drowningDuck = new RubberDuck(); // Simulating a duck that drowns
        drowningDuck.setSwimBehaviour(new Drown());

        System.out.println("__________________");
        redHeadDuck.display();
        redHeadDuck.performQuack();
        redHeadDuck.performSwim();
        redHeadDuck.performFly();
        System.out.println("__________________");
