public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("This is RedHead Duck");
    }
}
