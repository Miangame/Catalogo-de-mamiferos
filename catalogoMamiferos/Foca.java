package catalogoMamiferos;

/**
 * Clase que crea una foca
 * 
 * @author Miguel Ángel Gavilán Merino
 *
 */
public class Foca extends Mamifero {

	/**
	 * Número de extremidades
	 */
	private int extremidades = 4;

	public Foca(String nombre) {
		super(nombre);
	}

	@Override
	String comer() {
		return "Comiendo peces, crustaceos y cefalópodos";
	}

	@Override
	String desplazarse() {
		return "reptando o nadando";
	}

	@Override
	public String toString() {
		return "Foca [extremidades=" + extremidades + ", toString()=" + super.toString() + "]";
	}

}
