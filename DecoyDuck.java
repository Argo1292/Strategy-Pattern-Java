public class DecoyDuck extends Duck{
    public DecoyDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    @Override
    void display() {
        System.out.println("This is a Decoy Duck");
    }
}
