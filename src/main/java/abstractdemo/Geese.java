package abstractdemo;

public class Geese extends Avian {

    public Geese(String name) {
        super(name);
    }

    String makeSound() {
        return "HOONK!";
    }

    String eat() {
        return "Grass and vegetation";
    }

}
