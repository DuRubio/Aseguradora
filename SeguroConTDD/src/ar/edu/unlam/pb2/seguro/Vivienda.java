package ar.edu.unlam.pb2.seguro;

public class Vivienda {
	private String direccion;
	private String barrio;
	private String localidad;
	private String provincia;
	
	public Vivienda(String direccion, String barrio, String localidad, String provincia) {
		super();
		this.direccion = direccion;
		this.barrio = barrio;
		this.localidad = localidad;
		this.provincia = provincia;
	}

	

	protected String getDireccion() {
		return direccion;
	}

	protected void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	protected String getBarrio() {
		return barrio;
	}

	protected void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	protected String getLocalidad() {
		return localidad;
	}

	protected void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	protected String getProvincia() {
		return provincia;
	}

	protected void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
}
