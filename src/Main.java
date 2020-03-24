import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first coefficient: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second coefficient: ");
        double b = scanner.nextDouble();
        System.out.print("Enter third coefficient: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        equation.displaySolution();
    }
}
