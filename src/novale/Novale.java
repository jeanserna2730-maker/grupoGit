/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package novale;
import java.util.Scanner;
/**
 *
 * @author el_ingeniero
 */
public class Novale {
       

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("prueba");
        System.out.println("hola mundo");
        System.out.println("El secreto de salir adelante es empezar");
        suma();
    }
    
   public static void suma(){
       Scanner sc =new Scanner(System.in);
       System.out.println("INGRESE UN NUMERO");
       int num1=sc.nextInt();
       System.out.println("INGRESE OTRO NUMERO");
       int num2=sc.nextInt();
       int sum=num1+num2;
       System.out.println(num1+"+"+num2+"="+sum);
       
       
    
}
   
}
