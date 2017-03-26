package catalogoMamiferos;

/**
 * Clase abstracta que crea un mamífero, ya sea un homo sapiens, un murciélago o
 * una foca
 * 
 * @author Miguel Ángel Gavilán Merino
 *
 */
public abstract class Mamifero {
	/**
	 * Nombre de mamífero
	 */
	private String nombre;

	/**
	 * Etapa del mamífero
	 */
	private Etapa etapa;

	/**
	 * Número de veces que ha amamantado
	 */
	private int amamantado = 0;

	Mamifero(String nombre) {
		setNombre(nombre);
		setEtapa(Etapa.CRIA);
	}

	String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	Etapa getEtapa() {
		return etapa;
	}

	private void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}

	protected int getAmamantado() {
		return amamantado;
	}

	private void setAmamantado(int amamantado) {
		this.amamantado = amamantado;
	}

	/**
	 * Se amamanta cuando es cría
	 * 
	 * @return cadena
	 */
	private String amamantar() {
		madurar();
		setAmamantado(getAmamantado() + 1);
		return "Estoy amamantando";
	}

	/**
	 * Cuando se amamanta tres veces, cambia la etapa a adulto
	 */
	private void madurar() {
		if (getAmamantado() == 3) {
			setEtapa(Etapa.ADULTO);
		}
	}

	/**
	 * Si la etapa es cría, se amamanta, si no come
	 * 
	 * @return
	 */
	String alimentar() {
		if (getEtapa() == Etapa.CRIA)
			return amamantar();
		return comer();
	}

	/**
	 * Come
	 * 
	 * @return
	 */
	protected abstract String comer();

	/**
	 * Se desplaza
	 * 
	 * @return
	 */
	protected abstract String desplazarse();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mamifero other = (Mamifero) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equalsIgnoreCase(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Mamifero [nombre=" + nombre + ", etapa=" + etapa + ", amamantado=" + amamantado + ", alimentar()="
				+ alimentar() + ", desplazarse()=" + desplazarse() + "]";
	}

}
