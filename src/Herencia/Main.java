/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.Scanner;
/**
 *
 * @author jose_lomeli
 */
public class Main {
    public static void main(String[]arg){
    
       String marca,modelo;
       int año; 
       
       Scanner scan=new Scanner(System.in);
       
       System.out.println("Ingrese la marca del carro-->");
       marca=scan.nextLine();
       
       System.out.println("Ingrese el modelo del carro-->");
       modelo=scan.nextLine();
       
       System.out.println("Ingrese el año del carro-->");
       año=scan.nextInt();
       
        
       
       Bmw instancia_bmw=new Bmw(marca,modelo,año);
        
     
       
       
    }
}
