package catalogoMamiferos;

/**
 * Se lanza cuando la lista está vacía
 * 
 * @author Miguel Ángel Gavilán Merino
 *
 */
public class ListaVaciaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ListaVaciaException() {
		// TODO Auto-generated constructor stub
	}

	public ListaVaciaException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ListaVaciaException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public ListaVaciaException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ListaVaciaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
