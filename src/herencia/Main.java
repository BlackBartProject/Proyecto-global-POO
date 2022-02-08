/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Scanner;
/**
 *
 * @author jose_lomeli
 */
public class Main {
    public static void main(String[]arg){
    
       String color,modelo,equipamento;
       
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Ingrese el modelo del BMW-->");
       modelo=scan.nextLine();
       
       System.out.println("Ingrese el color del BMW-->");
       color=scan.nextLine();
       
       System.out.println("Ingrese el equipamento del auto-->");
       equipamento=scan.nextLine();
       
        Bmw bmw = new Bmw();
       
        
        System.out.println(bmw.equipamiento(equipamento));	
        System.out.println(bmw.modeloBmw(modelo));	
        System.out.println(bmw.colorBmw(color));	
        
        bmw.tipo();
       
    }
}
