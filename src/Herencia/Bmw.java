/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author jose_lomeli
 */
public class Bmw  extends Carro{
    
    
    private boolean turbo,deportivo;
    
    
    
    public Bmw(String marca,String modelo,int año){
    super(marca,modelo,año);
    } 
    
   public void setTurbo(boolean turbo){
       this.turbo=turbo;}
    
   
   public boolean getTurbo(){
   return turbo;}
   
   public void setDeportivo(boolean deportivo){
       this.deportivo=deportivo;}
    
   
   public boolean getDeportivo(){
   return deportivo;}
   
    
}
