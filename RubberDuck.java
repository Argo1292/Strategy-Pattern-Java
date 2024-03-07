public class RubberDuck extends Duck{
    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    @Override
    void display() {
        System.out.println("This is a rubber duck");
    }
}
