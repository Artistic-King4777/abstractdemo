package abstractdemo;

public class Main {
    public static void main(String[] args) {


        Animal cheetah = new Cheetah("Sasha");

        Animal sphynx = new Sphinx("Cleo");


        Animal lab = new Labrador("Chokolatte");

        Animal hybrid = new GiantWolfDog("Bubbles");


        Animal pMon = new Lugia("Lugia");

        Animal robin = new Robin("Luffy");

        Animal goose = new Geese("Zoro");

        Animal[] zoo = new Animal[]{cheetah, sphynx, lab, hybrid, pMon, robin, goose};

        for (Animal park : zoo) {
            //System.out.println();
            System.out.println("===========================" + "\n" + park.getName() + " eats: " + park.eat());
        }



    }
}
