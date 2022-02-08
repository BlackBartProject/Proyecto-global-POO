package encapsulamiento;
public class Main {
	public static void main(String[]args) {
		
		String nombre = "Jose";
		int edad = 29;
		
		Persona persona = new Persona();
		
		persona.setNombre(nombre);
		persona.setEdad(edad);
		
		System.out.println("el Nombre de la persona es: "+persona.getNombre());
		System.out.println("La edad de la persona es: "+persona.getEdad());
	}
}
