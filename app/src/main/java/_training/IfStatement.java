package _training;

public class IfStatement {
    public static void main(String[] args) {
        boolean brushedTeeth = true;
        boolean tookMints = false;
        boolean didHomework = false;
        boolean preparedForRobotics = true;

        if((brushedTeeth || tookMints) && didHomework && preparedForRobotics){
            System.out.println("I can go to robotics tonight!");
        }
    }
}
