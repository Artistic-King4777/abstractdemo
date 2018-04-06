package abstractdemo;

public class Sphinx extends Feline{


    public Sphinx(String name) {
        super(name);
    }

    String makeSound() {
        return "Mrooooww!";
    }

    String eat() {
        return "Fish and fries";
    }
}
