/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oddevenpicker;

/**
 *
 * @author GUERRA_CPE113
 */
import java.util.Scanner;
public class OddEvenPicker {

   
     public static void main(String[] args) {
      Scanner input= new Scanner (System.in);
      
       System.out.println("Pls input a number  ");
        int n = input.nextInt(); 
        
         System.out.println(printanswer(n));
        
    }static int printanswer(int n){
         if (n % 2==0){
        return 1;
     }   else {
            return 0;
    }
    
  }
    
}