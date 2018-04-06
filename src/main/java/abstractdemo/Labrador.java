package abstractdemo;

public class Labrador extends Canine {

    public Labrador(String name) {
        super(name);
    }

    String makeSound() {
        return "BORK";
    }

    String eat() {
        return "Ginger Cookie";
    }


}
