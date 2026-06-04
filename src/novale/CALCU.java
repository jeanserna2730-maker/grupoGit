/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package novale;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class CALCU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Entrada de datos
        System.out.print("Ingresa el primer número: ");
        // Num1 permite decimales
        double num1 = scanner.nextDouble();
        // Num2 permite decimales
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
        // Menú de opciones
        System.out.println("\nSelecciona una operación:");
        System.out.println("1. Sumar (+)");
        System.out.println("2. Restar (-)");
        System.out.println("3. Multiplicar (*)");
        System.out.println("4. Dividir (/)");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        double resultado = 0;
        boolean operacionValida = true;
    }
    
}
