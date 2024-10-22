public class Pasaporte {

	Pasajero pasajero;
	private String id;
	private String nacionalidad;
	private int hojasDisponibles;
	private String fechaExpiracion;
	private Pasajero propietario;

	public String getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	/**
	 * 
	 * @param nacionalidad
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getHojasDisponibles() {
		return this.hojasDisponibles;
	}

	/**
	 * 
	 * @param hojasDisponibles
	 */
	public void setHojasDisponibles(int hojasDisponibles) {
		this.hojasDisponibles = hojasDisponibles;
	}

	public String getFechaExpiracion() {
		return this.fechaExpiracion;
	}

	/**
	 * 
	 * @param fechaExpiracion
	 */
	public void setFechaExpiracion(String fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	public Pasajero getPropietario() {
		return this.propietario;
	}

	/**
	 * 
	 * @param propietario
	 */
	public void setPropietario(Pasajero propietario) {
		this.propietario = propietario;
	}

}