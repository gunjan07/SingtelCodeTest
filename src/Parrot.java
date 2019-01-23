public class Parrot extends Bird {
    public String livingWith , mySound;

    Parrot(){
    }

    Parrot(String livingWith,String mySound){
        this.livingWith = livingWith;
        this.mySound = mySound;
    }

    @Override
    public String sound() {
        return "A parront living with "+livingWith+" says "+mySound ;
    }
    @Override
    public String name() {
        return "Parrot";
    }

    @Override
    public String move() {
        return "fly";
    }
}
