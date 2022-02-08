package abstraccion;

/**
 * No se pueden instanciar las clases
 * abstractas
 */
public class Main {

	public static void main(String[] args) {
		Perro perro = new Perro();
		Gato gato = new Gato();
		
		System.out.println("un Perro emite: "+ perro.emitSound());
		System.out.println("un Gato emite: "+ gato.emitSound());
		System.out.println("Animal: "+ gato.emitSoundAnimal());
	}

}
