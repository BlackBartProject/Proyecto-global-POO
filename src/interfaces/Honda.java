package interfaces;

public class Honda implements Automovil {

	String modelo ="Honda crv";

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
