/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangleclassifier;

/**
 *
 * @author GUERRA_CPE113
 */
public class TriangleClassifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        System.out.println(classifyTriangle(5,5,5));   
     System.out.println(classifyTriangle(5,5,3));  
      System.out.println(classifyTriangle(3,4,5));   
       System.out.println(classifyTriangle(1,2,5));   
    
    }static int classifyTriangle (int a, int b, int c){
       if (a <= 0 || b <= 0 || c <= 0){
           return 0;
       } 
       if (a + b <= c || a + c <= b || b + c <= a){
           return 0;
       }
       if (a == b && b == c){
           return 1;
       }
       if (a == b || a == c || b == c){
           return 2;
       }
       return 3;
    
    }
    
}
