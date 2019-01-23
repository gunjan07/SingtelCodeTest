public class Chicken extends Bird  {
    String sound = "Chicken sound is Cluck, cluck";
    public String sound() {
        return sound;
    }
    public String move() {
        return "not fly";
    }

    @Override
    public String name() {
        return "Chicken";
    }
}
