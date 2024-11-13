package _training.Classes;

public class Food {
    private float score; // How critics rate the food out of 10
    private boolean tasty;
    public String name;

    Food(float score, boolean tasty, String name){
        this.score = score;
        this.tasty = tasty;
        this.name = name;
        System.out.println(name+ " is served!");
    }
}