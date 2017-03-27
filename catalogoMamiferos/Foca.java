package catalogoMamiferos;

import utiles.Utilidades;

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
	protected String comer() {
		String[] movimientos = { "peces", "crustaceos", "cefalópodos" };

		return movimientos[Utilidades.generarEnteroAleatorio(0, 2)];
	}

	@Override
	protected String desplazarse() {
		String[] movimientos = { "reptando", "nadando" };

		return movimientos[Utilidades.generarEnteroAleatorio(0, 1)];
	}

	@Override
	public String toString() {
		return "Foca [extremidades=" + extremidades + ", toString()=" + super.toString() + "]";
	}

}
