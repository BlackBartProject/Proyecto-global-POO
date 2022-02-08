package polimorfismo;

public class Main {
	public static void main(String[] args) {

		Animal animal = new Animal();
		Animal perro = new Perro();
		Animal gato = new Gato();
		
		System.out.println("un animal: " + animal.emitirSonido());
		System.out.println("un perro emite: " + perro.emitirSonido());
		System.out.println("un gato emite: " + gato.emitirSonido());
	}
}
