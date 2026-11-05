/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_restaurante;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_7_RESTAURANTE {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      String[] menu = new String [10];
      double[] precio = new double [10];
      Scanner captu = new Scanner(System.in);
      
      for (int i = 0; i < 10; i++) {
         System.out.println("Introduce el nombre del producto:");
         menu[i] = captu.nextLine();
         System.out.println("Introduce el precio del producto:");
         precio[i] = captu.nextDouble();
         captu.nextLine();
      }
      System.out.println("Menu:");
      for (int i = 0; i < 10; i++) {
         System.out.println("Producto:" + menu[i] + ", precio:" + precio[i]);
      }
   }
}