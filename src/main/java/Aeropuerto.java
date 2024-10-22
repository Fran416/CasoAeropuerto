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
	public Vuelo crearVuelo(String idVuelo, String modeloAvion, ArrayList<Ciudad> rutaVuelo, String fechaSalida, String fechaLlegada) {
		for (Avion avion : aviones) {
			if (avion.getModelo().equals(modeloAvion)) {
				avion.getVuelos().add(new Vuelo(idVuelo,rutaVuelo,modeloAvion,fechaSalida, fechaLlegada));
			}
		}
	}

	/**
	 * 
	 * @param modeloAvion
	 * @param capacidadMaxima
	 * @param propietario
	 */
	public void registrarAvion(String modeloAvion, int capacidadMaxima, String propietario) {
		aviones.add(new Avion(modeloAvion,capacidadMaxima,propietario));
	}

	/**
	 * 
	 * @param fechaSalida
	 */
	public ArrayList<Pasajero> mostrarPasajerosPorFecha(String fechaSalida) {
		ArrayList<Pasajero> pasajeroPorFecha = new ArrayList<>();
		for(Avion avion : aviones){
			for (Vuelo vuelo : avion.getVuelos()){
				if(vuelo.getFechaSalida().equals(fechaSalida)){
					for (Pasajero pasajero : vuelo.getPasajeros()){
						pasajeroPorFecha.add(pasajero);
					}
				}
			}
		}
		return pasajeroPorFecha;
	}

}