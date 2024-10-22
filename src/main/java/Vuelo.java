import java.util.*;

public class Vuelo {

	Avion avion;
	Collection<Pasajero> pasajerosVuelo;
	Collection<Ciudad> rutaVueloLista;
	Piloto pilotoAvion;
	private String modeloAvion;
	private ArrayList<Pasajero> pasajeros;
	private Piloto piloto;
	private String fechaSalida;
	private String fechaEstimadaLlegada;
	private ArrayList<Ciudad> rutaVuelo;
	private String idVuelo;
	private Piloto copiloto;

	public Vuelo(String idVuelo, ArrayList<Ciudad> rutaDeVuelo,String modeloDeAvion, String fechaSalida, String fechaEstimadaLlegada) {
		pasajerosVuelo = new ArrayList<Pasajero>();
		rutaVuelo = rutaDeVuelo;
		this.idVuelo = idVuelo;
		this.fechaSalida = fechaSalida;
		this.fechaEstimadaLlegada = fechaEstimadaLlegada;
		piloto = null;
		modeloAvion = modeloDeAvion;

	}

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