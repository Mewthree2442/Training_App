package _training;

public class WhileSolution {
    public static void main(String[] args) {
        int hoursWorked = 0;

        while (hoursWorked < 5) {
            if(hoursWorked < 0) {
                break;
            }
            System.out.println("I have worked for "+hoursWorked+" hours!");
            hoursWorked = hoursWorked - 1;
        }

        System.out.println("I am done working! I have worked for "+hoursWorked+" hours!");
    }
}
