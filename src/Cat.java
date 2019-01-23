public class Cat implements Animal {
    @Override
    public String sound() {
        return "Meows";
    }

    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String name() {
        return "Cat";
    }
    @Override
    public String sing(){
        return "Dont sing";
    }
}
