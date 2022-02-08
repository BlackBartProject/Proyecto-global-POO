package atributos_metodos;

/*****
 *static: Los metodos y atributos estaticos 
 *no necesitan inicializar un objeto y ser llamados
 */

public class Main {
	
	private final String constante = "Esto es una constante!";
	
	public static void methodStatic(){
		System.out.println("Metodo estatico...");
	}

	public static void main(String[]args){
		methodStatic();
		Main main = new Main(); //inicializar un objeto de la misma clase
		
		System.out.println("Ejemplo de una constante: "+main.constante);
	}
	
	
}
