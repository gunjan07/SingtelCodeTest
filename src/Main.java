public class Main {

    public static void main(String[] args) {

        Animal[] animals = new Animal[]{
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Shark(),
                new Clownfish(),
                new Dolhpin(),
                new Frog(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };
        int flyCount = 0;
        int walkCount = 0;
        int swimCount = 0;
        int singCount = 0;

        for (Animal i : animals) {
            if (i.move() == "fly"){
                flyCount++;
            }else if (i.move() == "walk"){
                walkCount++;
            }else if (i.move() == "swim"){
                swimCount++;
            }
            if (i.sing() == "sing"){
                singCount++;
            }
        }

        System.out.println("flyCount "+flyCount);
        System.out.println("walkCount "+walkCount);
        System.out.println("swimCount "+swimCount);
        System.out.println("singCount "+singCount);

    }

}
