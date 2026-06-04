/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package novale;
import java.util.Scanner;


public class AREA {

   
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
 System.out.println("RADIO");
 double radio = sc.nextDouble();
 double area=Math.PI*radio*radio;
 System.out.printf("El area es: %.2f",area);
 
    }
    
}
