public class DeadDuck extends Duck{
    public DeadDuck() {
        quackBehaviour = new NoQuack();
        flyBehaviour = new FlyNoWay();
        swimBehaviour = new Drown();
    }

    @Override
    void display() {
        System.out.println("This is Dead Duck");
    }
}
