package catalogoMamiferos;

import java.util.ArrayList;
import java.util.ListIterator;

import catalogoMamiferos.excepciones.*;

/**
 * Envoltorio de un ArrayList de mamíferos
 * 
 * @author Miguel Ángel Gavilán Merino
 *
 */
public class Mamiferos {

	/**
	 * Lista con los mamíferos
	 */
	private ArrayList<Mamifero> mamiferos = new ArrayList<Mamifero>();

	/**
	 * Añade un mamífero y comprueba que no exista
	 * 
	 * @param mamifero
	 * @throws MamiferoYaExisteException
	 */
	void add(Mamifero mamifero) throws MamiferoYaExisteException {
		if (mamiferos.contains(mamifero))
			throw new MamiferoYaExisteException("Ese mamífero ya existe");

		mamiferos.add(mamifero);
	}

	/**
	 * Devuelve un cadena con todos los mamíferos
	 * 
	 * @return
	 * @throws ListaVaciaException
	 */
	StringBuilder listarMamiferos() throws ListaVaciaException {
		StringBuilder cadena = new StringBuilder();

		if (mamiferos.isEmpty())
			throw new ListaVaciaException("La lista está vacía");

		int i = 1;
		for (Mamifero mamifero : mamiferos) {
			cadena.append("\n" + i++ + ". " + mamifero);
		}

		return cadena;
	}

	/**
	 * Devuelve una cadena con los humanos
	 * 
	 * @return
	 * @throws ListaVaciaException
	 */
	StringBuilder listarHumanos() throws ListaVaciaException {
		StringBuilder cadena = new StringBuilder();

		if (mamiferos.isEmpty())
			throw new ListaVaciaException("La lista está vacía");

		int i = 1;
		for (Mamifero mamifero : mamiferos) {
			if (mamifero instanceof HomoSapiens)
				cadena.append("\n" + i++ + ". " + mamifero);
		}

		return cadena;
	}

	/**
	 * Devuelve una cadena con las focas en orden inverso
	 * 
	 * @return
	 * @throws ListaVaciaException
	 */
	StringBuilder listarFocasInverso() throws ListaVaciaException {
		StringBuilder cadena = new StringBuilder();

		if (mamiferos.isEmpty())
			throw new ListaVaciaException("La lista está vacía");

		ListIterator<Mamifero> it = mamiferos.listIterator(mamiferos.size());
		int i = 1;
		while (it.hasPrevious()) {
			Mamifero m = it.previous();
			if (m instanceof Foca)
				cadena.append("\n" + i++ + ". " + m);
		}
		
		return cadena;

		/*
		 * int i = 1; for (int j = mamiferos.size() - 1; j >= 0; j--) { if
		 * (mamiferos.get(j) instanceof Foca) cadena.append("\n" + i++ + ". " +
		 * mamiferos.get(j)); }
		 * 
		 * return cadena;
		 */
	}

	/**
	 * Cuenta el número de murciélagos que hay
	 * 
	 * @return
	 * @throws ListaVaciaException
	 */
	int contarMurcielagos() throws ListaVaciaException {
		if (mamiferos.isEmpty())
			throw new ListaVaciaException("La lista está vacía");

		int contador = 0;
		for (Mamifero mamifero : mamiferos) {
			if (mamifero instanceof Murcielago)
				contador++;
		}

		return contador;
	}

	/**
	 * Devuelve el tamaño de la lista
	 * 
	 * @return
	 */
	int size() {
		return mamiferos.size();
	}

	/**
	 * Alimenta a todos los mamíferos
	 * 
	 * @throws ListaVaciaException
	 */
	public void alimentarMamiferos() throws ListaVaciaException {
		if (mamiferos.isEmpty())
			throw new ListaVaciaException("La lista está vacía");

		for (int i = 0; i < mamiferos.size(); i++) {
			mamiferos.get(i).alimentar();
		}
	}
}
