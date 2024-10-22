public class Pasajero {

	Vuelo vuelo;
	Pasaporte pasaportePasajero;
	private String nombre;
	private String apellidos;
	private Pasaporte pasaporte;

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

	public String getApellidos() {
		return this.apellidos;
	}

	/**
	 * 
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Pasaporte getPasaporte() {
		return this.pasaporte;
	}

	/**
	 * 
	 * @param pasaporte
	 */
	public void setPasaporte(Pasaporte pasaporte) {
		this.pasaporte = pasaporte;
	}

}