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
public class Carro {
    private String marca;
    private String modelo;
    private int año;
    
    
    public Carro(String marca,String modelo, int año){
    this.marca=marca;
    this.modelo=modelo;
    this.año=año;}
    
    public float mostrarKilometros(float kilometros){
    
        return kilometros;
    }
    
    public float mostrarPrecio(float precio){
    return precio;}
    
    
    
    public void setMarca(String marca){
    this.marca=marca;}
    
    public void setModelo(String modelo){
    this.modelo=modelo;}
    
    public void setAño(int ao){
    this.año=año;}
    
    public String getMarca(){
    return marca;}

    public String getModelo() {
        return modelo;}

    public int getAño() {
        return año;}
    
    
    
    
    
    
    
    
    
    
    
    
}
