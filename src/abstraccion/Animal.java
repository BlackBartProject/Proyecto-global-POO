package abstraccion;

public abstract class Animal {

	public String sonido= "Un animal emite sonido";
	
	public abstract String emitSound();
	
	public String emitSoundAnimal() {
		return sonido;
	}
}
