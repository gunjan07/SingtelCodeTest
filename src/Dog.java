public class Dog implements Animal {
    @Override
    public String sound() {
        return "Barks";
    }

    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String name() {
        return "Dog";
    }
    @Override
    public String sing(){
        return "Dont sing";
    }
}
