package abstractdemo;

public class Lugia extends Avian {

    public Lugia(String name) {
        super(name);
    }

    String makeSound() {
        return "SkreEeeSoNg";
    }

    String eat() {
        return "Fish and Eggs";
    }
}
