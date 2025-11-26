package Tugas;

public class Tugas1 {

    /**
     * @param args arguments from the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            int result = 3 / 0; 
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        
    }
}