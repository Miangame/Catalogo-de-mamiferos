package catalogoMamiferos;

/**
 * Clase que crea un homo sapiens
 * 
 * @author Miguel Ángel Gavilán Merino
 *
 */
public class HomoSapiens extends Mamifero {
	/**
	 * Número de piernas
	 */
	private int piernas = 2;
	/**
	 * Número de brazos
	 */
	private int brazos = 2;

	HomoSapiens(String nombre) {
		super(nombre);
	}

	@Override
	protected String comer() {
		return "Comiendo de todo";
	}

	@Override
	protected
	String desplazarse() {
		if (getEtapa() == Etapa.CRIA)
			return "Gateando";

		return "Corriendo";
	}

	@Override
	public String toString() {
		return "HomoSapiens [piernas=" + piernas + ", brazos=" + brazos + ", toString()=" + super.toString() + "]";
	}

}
