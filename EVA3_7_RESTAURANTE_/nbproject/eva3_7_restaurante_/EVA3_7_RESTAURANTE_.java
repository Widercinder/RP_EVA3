/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_restaurante_;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_7_RESTAURANTE_ {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      String[] producto = new String [10];
      double[] precio = new double [10];
      Scanner captu = new Scanner(System.in);
      
       producto[0] = "Tacos de bistec";
       producto[1] = "Tacos de pollo";
       producto[2] = "Tacos de perro";
       producto[3] = "Burritos de chile relleno";
       producto[4] = "Burritos de asado rojo";
       producto[5] = "Burritos de asado verde";
       producto[6] = "Burritos de picadillo";
       producto[7] = "Burritos de bistec a la mexicana";
       producto[8] = "Burritos de discada";
       producto[9] = "Burritos de pollo en mole";
       precio[0] = 45;
       precio[1] = 45;
       precio[2] = 10;
       precio[3] = 45;
       precio[4] = 25;
       precio[5] = 25;
       precio[6] = 20;
       precio[7] = 25;
       precio[8] = 20;
       precio[9] = 25;
      
       for (int i = 0; i < producto.length; i++) {
          System.out.println("producto: " + producto[i] + " precio: " +precio[i]);
      }
      
      
   
   }
}
