package interfaces;

public class Bmw implements Automovil{
	
	String modelo ="BMW Especial";

	public double aceleracion(double km) {
		return km;
	}
	
	public String equipamiento(String equipamiento) {
		return equipamiento;
	}
	
	public String modelo() {
		return modelo;
	}
}
