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
public class MAYOR {

    public static void main(String[] args) {
       
    Scanner sc=new Scanner(System.in);
    System.out.printf("Numero 1: "); int n1=sc.nextInt();
    System.out.printf("Numero 2: "); int n2=sc.nextInt();
    System.out.printf("Numero 3: "); int n3=sc.nextInt();
    System.out.println("-".repeat(20));
    if (n1>n2 && n1>n3){
    System.out.printf("NUMERO %d.MAYOR",n1);
    }else if(n2>n1 && n2>n3){
    System.out.printf("NUMERO %d -> MAYOR",n2);
    }else{
    System.out.printf("NUMERO %d -> MAYOR",n3);
 }
    }
    
}
