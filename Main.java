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

    
        System.out.println("__________________");
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performSwim();
        mallardDuck.performFly();
        System.out.println("__________________");

        System.out.println("__________________");
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performSwim();
        rubberDuck.performFly();
        System.out.println("__________________");

        System.out.println("__________________");
        drowningDuck.display();
        drowningDuck.performQuack();
        drowningDuck.performSwim(); // Now drowns instead of floating
        drowningDuck.performFly();
        System.out.println("__________________");
    }
}
