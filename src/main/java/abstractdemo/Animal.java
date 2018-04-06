package abstractdemo;

public abstract class Animal {

    private String name;

    //Method signatures / stubs
    abstract String makeSound();

    abstract String eat();




    public Animal(String name){
        this.name = name;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

/*

make uml for abstract demo

make abstract uml for emplyee to map it out

make employee project abstract


 */