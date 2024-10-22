import java.util.*;

public class Vuelo {

	Avion avion;
	Collection<Pasajero> pasajerosVuelo;
	Collection<Ciudad> rutaVueloLista;
	Piloto pilotoAvion;
	private ArrayList<Pasajero> pasajeros;
	private Piloto piloto;
	private String fechaSalida;
	private String fechaEstimadaLlegada;
	private ArrayList<Ciudad> rutaVuelo;
	private String idVuelo;
	private Piloto copiloto;

	public ArrayList<Pasajero> getPasajeros() {
		return this.pasajeros;
	}

	/**
	 * 
	 * @param pasajeros
	 */
	public void setPasajeros(ArrayList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public Piloto getPiloto() {
		return this.piloto;
	}

	/**
	 * 
	 * @param piloto
	 */
	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public String getFechaSalida() {
		return this.fechaSalida;
	}

	/**
	 * 
	 * @param fechaSalida
	 */
	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public String getFechaEstimadaLlegada() {
		return this.fechaEstimadaLlegada;
	}

	/**
	 * 
	 * @param fechaEstimadaLlegada
	 */
	public void setFechaEstimadaLlegada(String fechaEstimadaLlegada) {
		this.fechaEstimadaLlegada = fechaEstimadaLlegada;
	}

	public ArrayList<Ciudad> getRutaVuelo() {
		return this.rutaVuelo;
	}

	/**
	 * 
	 * @param rutaVuelo
	 */
	public void setRutaVuelo(ArrayList<Ciudad> rutaVuelo) {
		this.rutaVuelo = rutaVuelo;
	}

	public String getIdVuelo() {
		return this.idVuelo;
	}

	/**
	 * 
	 * @param idVuelo
	 */
	public void setIdVuelo(String idVuelo) {
		this.idVuelo = idVuelo;
	}

	/**
	 * 
	 * @param pasajeros
	 * @param piloto
	 * @param fechaSalida
	 * @param fechaEstimadaLlegada
	 * @param rutaVuelo
	 * @param idVuelo
	 */
	public void Vuelo(ArrayList<Pasajero> pasajeros, String piloto, String fechaSalida, String fechaEstimadaLlegada, ArrayList<Ciudad> rutaVuelo, String idVuelo) {
		// TODO - implement Vuelo.Vuelo
		throw new UnsupportedOperationException();
	}

	public Piloto getCopiloto() {
		return this.copiloto;
	}

	/**
	 * 
	 * @param copiloto
	 */
	public void setCopiloto(Piloto copiloto) {
		this.copiloto = copiloto;
	}

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 */
	public void agregarPasajero(String nombre, String apellido) {
		// TODO - implement Vuelo.agregarPasajero
		throw new UnsupportedOperationException();
	}

}