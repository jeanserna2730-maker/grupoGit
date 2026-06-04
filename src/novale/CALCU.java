/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package novale;
import java.util.Scanner;

public class CALCU {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Entrada de datos
        System.out.print("Ingresa el primer numero: ");
        // Num1 permite decimales
        double num1 = scanner.nextDouble();
        // Num2 permite decimales
        System.out.print("Ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();
        // Menú de opciones
        System.out.println("\nSelecciona una operacion:");
        System.out.println("1. Sumar (+)");
        System.out.println("2. Restar (-)");
        System.out.println("3. Multiplicar (*)");
        System.out.println("4. Dividir (/)");
        System.out.print("Opcion: ");
        int opcion = scanner.nextInt();

        double resultado = 0;
        boolean operacionValida = true;
        // Procesamiento de la operación
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                // Validación para evitar división entre cero
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("\nError: No se puede dividir entre cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("\nOpcion no valida.");
                operacionValida = false;
                break;
                
        }
        // Mostrar resultado
        if (operacionValida) {
            System.out.println("\nEl resultado es: " + resultado);
        }

        scanner.close();
        }
    }   

