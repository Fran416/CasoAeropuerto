public class Ciudad {

	Vuelo vuelo;
	private String nombre;
	private int latitud;
	private int longitud;

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

	public int getLatitud() {
		return this.latitud;
	}

	/**
	 * 
	 * @param latitud
	 */
	public void setLatitud(int latitud) {
		this.latitud = latitud;
	}

	public int getLongitud() {
		return this.longitud;
	}

	/**
	 * 
	 * @param longitud
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

}