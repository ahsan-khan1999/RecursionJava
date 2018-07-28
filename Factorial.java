import java.util.InputMismatchException;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(Factorial.factorial(2));
    }

    public static int factorial(int i) {
        try {
            if (i == 0) {
                return 1;
            }
            }
            catch (Exception e){
                System.out.println("");
            }
            try {
            if (i < 0) {
                    System.out.println("Input Mistmatch Exception!!");

                } else {
                    return i * factorial(i - 1);
                }
            }
        catch (IllegalArgumentException e){
            System.out.println("Invalid Input !!");
        }

        return 0;
    }
}
