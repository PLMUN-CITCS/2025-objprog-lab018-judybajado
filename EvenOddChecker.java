import java.util.Scanner;

public class EvenOddChecker {


    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

  
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }

 
    public static void displayResult(int number, String result) {
        System.out.println(number + " is an " + result + " number.");
    }


    public static void main(String[] args) {
        int number = getInput(); 
        String result = checkEvenOdd(number); 
        displayResult(number, result); 
    }
}
