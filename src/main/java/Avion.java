import java.util.*;

public class Avion {

	Aeropuerto aeropuerto;
	Collection<Vuelo> vuelosRegistrados;
	private ArrayList<Vuelo> vuelos;
	private String modelo;
	private int capacidad;
	private String propietario;

	public String getModelo() {
		return this.modelo;
	}

	/**
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public ArrayList<Vuelo> getVuelos() {
		return this.vuelos;
	}

	/**
	 * 
	 * @param vuelos
	 */
	public void setVuelos(ArrayList<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	public int getCapacidad() {
		return this.capacidad;
	}

	/**
	 * 
	 * @param capacidad
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getPropietario() {
		return this.propietario;
	}

	/**
	 * 
	 * @param propietario
	 */
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

}