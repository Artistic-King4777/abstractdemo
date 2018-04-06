package abstractdemo;

public class GiantWolfDog extends Canine{

    public GiantWolfDog(String name) {
        super(name);
    }

    String makeSound() {
        return "AWOOOOOO";
    }

    String eat() {
        return "Rabbit";
    }
}
