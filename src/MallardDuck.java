public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FLyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I'm a real mallard duck!");
    }
}
