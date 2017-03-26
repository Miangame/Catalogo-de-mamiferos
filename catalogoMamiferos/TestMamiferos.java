package catalogoMamiferos;

import utiles.*;

/**
 * Test que maneja una lista de mamíferos
 * 
 * @author Miguel Ángel Gavilán Merino
 *
 */
public class TestMamiferos {
	static String[] opciones = { "Añadir mamífero", "Listar mamíferos", "Listar humanos",
			"Listar focas en orden inverso", "Contar murciélagos", "Alimentar a todos los mamíferos del catálogo",
			"Salir" };
	static Menu menu = new Menu("\n---Catálogo de mamíferos---", opciones);
	static String[] opcionesMamiferos = { "Homo Sapiens", "Murciélago", "Foca", "Salir" };
	static Menu menuMamiferos = new Menu("\n---Seleccione un mamífero---", opcionesMamiferos);

	static Mamiferos catalogo = new Mamiferos(); // Catálogo con los mamíferos

	public static void main(String[] args) {
		int opcion;

		do {
			opcion = menu.gestionar();
			switch (opcion) {
			case 1:
				anadirMamifero(); // Añade un mamífero
				break;

			case 2:
				listarMamiferos(); // Muestra todos los mamíferos
				break;

			case 3:
				listarHumanos(); // Muestra todos los humanos
				break;

			case 4:
				listarFocas(); // Muestra todas las focas en orden inverso
				break;

			case 5:
				contarMurcielagos(); // Muestra el número de murciélagos que hay
				break;

			case 6:
				alimentarMamiferos();
				break;

			default:
				System.out.println("\nSALIENDO...");
				break;
			}
		} while (opcion != 7);

	}

	/**
	 * Alimenta a todos los mamíferos del catálogo
	 */
	private static void alimentarMamiferos() {
		try {
			catalogo.alimentarMamiferos();
			System.out.println("\nMamíferos alimentados!");
		} catch (ListaVaciaException e) {
			System.err.println(e.getMessage());
		}
	}

	/**
	 * Cuenta el número de murciélagos
	 */
	private static void contarMurcielagos() {
		try {
			System.out.println("\nHay " + catalogo.contarMurcielagos() + " murciélagos");
		} catch (ListaVaciaException e) {
			System.err.println(e.getMessage());
		}

	}

	/**
	 * Muestra las focas en orden inverso
	 */
	private static void listarFocas() {
		try {
			System.out.println(catalogo.listarFocasInverso());
		} catch (ListaVaciaException e) {
			System.err.println(e.getMessage());
		}

	}

	/**
	 * Muestra a todos los humanos
	 * 
	 */
	private static void listarHumanos() {
		try {
			System.out.println(catalogo.listarHumanos());
		} catch (ListaVaciaException e) {
			System.err.println(e.getMessage());
		}

	}

	/**
	 * Muestra todos los mamíferos
	 */
	private static void listarMamiferos() {
		try {
			System.out.println(catalogo.listarMamiferos());
		} catch (ListaVaciaException e) {
			System.err.println(e.getMessage());
		}

	}

	/**
	 * Añade un mamífero a la lista
	 */
	private static void anadirMamifero() {
		try {
			Mamifero mamifero = pedirMamifero();
			if (mamifero != null) {
				catalogo.add(mamifero);
				System.out.println("\nMamífero añadido correctamente!");
			} else {
				System.out.println("\nVolviendo al menú principal");
			}

		} catch (MamiferoYaExisteException e) {
			System.err.println(e.getMessage());
		}
	}

	/**
	 * Pide un mamífero por teclado
	 * 
	 * @return
	 */
	private static Mamifero pedirMamifero() {
		int opcion;
		do {
			opcion = menuMamiferos.gestionar();
			switch (opcion) {
			case 1:
				return new HomoSapiens(TecladoScanner.leerCadena("Introduzca un nombre: "));
			case 2:
				return new Murcielago(TecladoScanner.leerCadena("Introduzca un nombre: "));
			case 3:
				return new Foca(TecladoScanner.leerCadena("Introduzca un nombre: "));
			default:
				return null;
			}
		} while (opcion != 4);
	}

}
