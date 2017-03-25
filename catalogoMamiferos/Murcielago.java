package catalogoMamiferos;

/**
 * Clase que crea un murciélago
 * 
 * @author Miguel Ángel Gavilán Merino
 *
 */
public class Murcielago extends Mamifero {

	/**
	 * Número de alas
	 */
	private int alas = 2;

	/**
	 * Número de patas
	 */
	private int patas = 2;

	public Murcielago(String nombre) {
		super(nombre);
	}

	@Override
	String comer() {
		return "Comiendo insectos";
	}

	@Override
	String desplazarse() {
		return "Volando";
	}

	@Override
	public String toString() {
		return "Murcielago [alas=" + alas + ", patas=" + patas + ", toString()=" + super.toString() + "]";
	}

}
