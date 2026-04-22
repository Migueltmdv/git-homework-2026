import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = num1 + num2;

        System.out.println("La suma es: " + resultado);

        scanner.close();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduce el tercer número: ");
        double num3 = scanner2.nextDouble();
        System.out.println("El resultado es: " + (resultado + num3));
        scanner2.close();
    }
}