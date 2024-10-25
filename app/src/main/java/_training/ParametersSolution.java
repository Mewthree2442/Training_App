package _training;

public class ParametersSolution {
    static void multiply(int num, int num2){
        System.out.println(num*num2);
    }
    static void multiplyDecimals(double num, double num2){
        System.out.println(num*num2);
    }

    public static void main(String[] args){
        multiply(3, 5);
        multiply(5, 6);
        multiply(9, 7);
        
        int myNum = 8;
        int myNum2 = 6;
        multiply(myNum, myNum2);
        
        // multiply(2.3,6.1); // We can't do this!
        multiplyDecimals(2.3, 6.1);
    }
}
