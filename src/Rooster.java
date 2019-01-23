public class Rooster extends Bird{
    Chicken chicken = new Chicken();

    @Override
    public String sound() {
        chicken.sound = "Rooster sound is Cock-a-doodle-doo";
        return chicken.sound();
    }

    @Override
    public String move() {
        return chicken.move();
    }

    @Override
    public String name() {
        return "Rooster";
    }
}
