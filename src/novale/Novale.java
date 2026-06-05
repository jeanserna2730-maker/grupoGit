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
       

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("prueba ");
        System.out.println("hola muchachos");
        System.out.println("Si tienes hambre, come");
        System.out.println("sr isacc menos 1 por malcriado");
        System.out.println("Perdon Inge pipipipi");
       
        crear_un_algoritmo_para_adivinar_credenciales();
    }
    //crear un algoritmo para adivinar credenciales
    
    public static void crear_un_algoritmo_para_adivinar_credenciales(){
        //crear un algoritmo para adivinar credenciales
        Scanner sc =new Scanner(System.in);
        final String clave= "ConTraSeÑa9555";//contraseña segura
        System.out.println("");
        System.out.print("=".repeat(20)+"\nADIVINAR CREDENCIALES \n"+ "=".repeat(20));
        
        for (int i = 0; i < 3; i++) {
            System.out.println("\nNOTA: Tiene solo 3 intentos: INTENTO NUM: " +(3-i));
                 System.out.println("\nINTRODUZCA CONTRASEÑA: ");
                 
        String contrasena=sc.nextLine(); 
                if (contrasena.equals(clave)) {
            System.out.println("CONTRASEÑA CORRECTA. !BIENVENIDO! ");
            return;
        } 
                System.out.println("CONTRASEÑA INCORRECTO.VUELVA A INTENTAR: INTENTO: "+(i+1+" AGOTADO"));
        }
        System.out.println("Intentos AGOTADOs !BLOQUEADO!");
        

       
        
    }
        
        
    
    
   public static void suma(){
       //suma de dos numeros
       Scanner sc =new Scanner(System.in);
       System.out.println("INGRESE UN NUMERO");
       int num1=sc.nextInt();
       System.out.println("INGRESE OTRO NUMERO");
       int num2=sc.nextInt();
       int sum=num1+num2;
       System.out.println(num1+"+"+num2+"="+sum);
       
       
    
}
   }
   

