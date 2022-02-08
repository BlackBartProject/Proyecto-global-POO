package clases_internas;
/*
 * Se pueden anidar clases una
 * dentro de la otra
 */

public class Outer {
	public String outer = "Clase externa";
	
	public String outerMessage() {
		return "Metodo externo";
	}
	
	
	class Inner {
		public String inner = "Clase interna";
		
		public String innerMessage() {
			return "Metodo interno";
		}
	}
	
}
