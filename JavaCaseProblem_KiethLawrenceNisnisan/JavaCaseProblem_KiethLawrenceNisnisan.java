import java.util.Scanner;

public class JavaCaseProblem_KiethLawrenceNisnisan {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Name: Kieth Lawrence L. Nisnisan");
        System.out.println("School ID: 2024303452");
        System.out.println("---------------------------");
        System.out.print("Enter first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter second number: ");
        int num2 = s.nextInt();
        double quotient = num1 / num2;

        System.out.println("The quotient between " + num1 + " and " + num2 + " is " + quotient);
        s.close();
    }
}