import java.util.*;

public class Aeropuerto {

	Collection<Avion> avion;
	private String nombre;
	private String direccion;
	private ArrayList<Avion> aviones;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Avion> getAviones() {
		return this.aviones;
	}

	/**
	 * 
	 * @param aviones
	 */
	public void setAviones(ArrayList<Avion> aviones) {
		this.aviones = aviones;
	}

	/**
	 * 
	 * @param idVuelo
	 * @param modeloAvion
	 * @param rutaVuelo
	 * @param fechaSalida
	 * @param fechaLlegada
	 */
	public Vuelo crearVuelo(String idVuelo, String modeloAvion, ArrayList<String> rutaVuelo, String fechaSalida, String fechaLlegada) {
		// TODO - implement Aeropuerto.crearVuelo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param modeloAvion
	 * @param capacidadMaxima
	 * @param propietario
	 */
	public void registrarAvion(String modeloAvion, int capacidadMaxima, String propietario) {
		// TODO - implement Aeropuerto.registrarAvion
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fechaSalida
	 */
	public ArrayList<Pasajero> mostrarPasajerosPorFecha(String fechaSalida) {
		// TODO - implement Aeropuerto.mostrarPasajerosPorFecha
		throw new UnsupportedOperationException();
	}

}