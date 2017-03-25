package catalogoMamiferos;

/**
 * Se lanza si un mamífero ya existe en la lista
 * 
 * @author Miguel Ángel Gavilán Merino
 *
 */
public class MamiferoYaExisteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MamiferoYaExisteException() {
		// TODO Auto-generated constructor stub
	}

	public MamiferoYaExisteException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MamiferoYaExisteException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public MamiferoYaExisteException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MamiferoYaExisteException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
