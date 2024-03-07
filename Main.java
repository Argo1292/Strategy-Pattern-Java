/*
Rampalli Agni Mithra
22070126083
B1
 */

public class Main {
    public static void main(String[] args){
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();

        DeadDuck deadDuck = new DeadDuck();
        deadDuck.display();
        deadDuck.performFly();
        deadDuck.performQuack();

    }
}
