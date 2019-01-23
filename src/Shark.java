public class Shark extends Fish{

    @Override
    String size() {
        return "Sharks are large";
    }

    @Override
    String eat() {
        return "Sharks eat Other Fish";
    }

    @Override
    String colour(){
        return "Sharks are grey";
    }
}
