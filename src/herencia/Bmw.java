/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * Con la palabra reservada: super
 * podemos hacer referencia a atributos
 * y metodos de la clase padre
 */
public class Bmw  extends Automovil{
   
	public String modeloBmw(String modelo) {
		return "El modelo del BMW es: "+ modelo;
	}
	
	public String colorBmw(String color) {
		return "El color del BMW es: "+ color;
	}
	
	public void equipamiento() { // Ejemplo de super
		super.equipamiento("Aire acondicionado");
	}
	
	@Override //sobreescritura
	public void tipo() {
		System.out.println("El BMW es de tipo sedan");
	}
   
	
    
}
