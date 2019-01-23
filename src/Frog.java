public class Frog implements Animal {
    @Override
    public String sound() {
        return "croak";
    }

    @Override
    public String move() {
        return "Jumps";
    }

    @Override
    public String name() {
        return "Frog";
    }
    @Override
    public String sing(){
        return "Dont sing";
    }
}
