public class Duck extends Bird {
    public String sound() {
        return "Quack,quack";
    }
    public String move() {
        return "swim";
    }

    @Override
    public String name() {
     return "duck";
    }

    public String enviornment(){
        return "water and land";
    }
}
