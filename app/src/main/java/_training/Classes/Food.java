package _training.Classes;

public class Food {
    private float score; // How critics rate the food out of 10
    private boolean tasty;
    private String name;

    public Food(float score, boolean tasty, String name){
        this.score = score;
        this.tasty = tasty;
        this.name = name;
        System.out.println(name+ " is served!");
    }

    /*
     * YOU DON'T NEED TO SEE ANYTHING BELOW THIS DURING THE
     * "Properties & Constructors"
     * SECTION.
     * PAUSE HERE!
     */
    
    public String getName(){
        // Anything that needs to be done here before getting number
        // Maybe a counter for times name is read?
        return this.name;
    }

    public void setName(String newName){
        System.out.println("This "+this.name+" looks more like a "+newName+".");
        // Any other code like the above to run before setting name
        // Maybe tell everyone around you that the food has changed names?
        this.name = newName;
    }

    public float getScore(){
        return this.score;
    }

    public boolean isTasty(){
        return this.tasty;
    }

    public void bite(int bites){
        System.out.println("I am going to eat this "+this.name+"!");
        for(int i = 0; i < bites; i++){
            System.out.println("NOM");
        }
        if(this.tasty){
            System.out.println("Yummy!\n"); // \n represents a new blank line
        }
        
    }

    public void addSpice(){
        System.out.println("This "+this.name+" looks pretty bland.");
        tasty = true;
        System.out.println("I spiced it, and now it is more tasty!");
        score++; // The ++ operator increases a number by 1.
    }
}