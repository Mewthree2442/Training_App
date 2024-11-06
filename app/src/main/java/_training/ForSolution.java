package _training;

public class ForSolution {
    public static void main(String[] args){
        for (int i = 30; i > 0; i--){
            for (int quarters = 0; quarters < 5; quarters++){
                System.out.println("I ran in " + quarters + " quarters with " + i + " circle remaining!");
            }
            System.out.println("I have to run "+i+" more circles today!");
        }
    }
}
