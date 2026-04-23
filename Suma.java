import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Elige una operación: suma, resta, multiplicación o salir");
            String operacion = scanner.next();

            if (operacion.equalsIgnoreCase("salir")) {
                continuar = false;
                break;
            }

            System.out.print("Introduce el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Introduce el segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;

            switch (operacion.toLowerCase()) {
                case "suma":
                    resultado = num1 + num2;
                    break;
                case "resta":
                    resultado = num1 - num2;
                    break;
                case "multiplicación":
                case "multiplicacion":
                    resultado = num1 * num2;
                    break;
                default:
                    System.out.println("Operación no válida. Intenta de nuevo.");
                    continue;
            }

            System.out.println("El resultado es: " + resultado);

            System.out.println("¿Quieres realizar otra operación? (sí/no)");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("sí")) {    
                continuar = false;
            }

            System.out.println(); 

            
        }

        scanner.close();
    }
}