package abstractdemo;

public class Robin extends Avian{

    public Robin(String name) {
        super(name);
    }

    String makeSound() {
        return "TweetTweet";
    }

    String eat() {
        return "Worms and Insects";
    }

}
