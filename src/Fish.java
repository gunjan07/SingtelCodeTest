public abstract class Fish implements Animal{

    @Override
    public String sound() {
        return "No Sound";
    }

    @Override
    public String move() {
        return "swim";
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public String sing(){
        return "Dont sing";
    }

    abstract String size();

    abstract String eat();

    abstract String colour();
}
