/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package novale;


public class TABLASMULTI {
 public static void main(String[] args) {
 int j=0,i=0;
 System.out.println("TABLAS DE MULTIPLICAR \n"+ "".repeat(20));
 for (i=1;i<=12;i++){
 System.out.printf("TABLA DEL: "+i+"\t\t");}
 System.out.println();
 for (j=1;j<=12;j++){
 for (i=1;i<=12;i++){
 System.out.printf(i+"x"+j+"="+(i*j)+"\t\t\t"); }
 System.out.println();
 }
 }
}
