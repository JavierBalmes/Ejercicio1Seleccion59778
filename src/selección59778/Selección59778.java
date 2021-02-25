/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selección59778;

import java.util.Scanner;

/**
 *
 * @author Elias
 */
@SuppressWarnings("InitializerMayBeStatic")
public class Selección59778 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner datos = new Scanner(System.in);
        System.out.println("Introduce el primer dato");
        int dato1 = datos.nextInt();
        System.out.println("Introduce el segundo dato");
        int dato2 = datos.nextInt();
        System.out.println("Introduce el tercer dato");
        int dato3 = datos.nextInt();
        
        if (dato1 > dato2 && dato1 > dato3) {
            System.out.println("El dato 1 es el mayor");
    
        } else {
            if (dato2 > dato1 && dato2 > dato3) {
            System.out.println("El dato 2 es el mayor");
             } else {
                if (dato3 > dato1 && dato3 > dato2) {
            System.out.println("El dato 3 es el mayor");
            
    
        } else {
        
    
}
