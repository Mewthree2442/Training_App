package _training;

public class Return {
    static float square(float num){
        return num*num;
    }
    public static void main(String[] args){
        float squareFive = square(5);
        float squareTwo = square(2);
        System.out.println(squareFive + squareTwo);
    }
}
