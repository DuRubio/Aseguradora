package ar.edu.unlam.pb2.seguro;

public class Auto {
	private String marca;
	private String modelo;
	private Integer año;
	private Double sumaAsegurada;
	public Auto(String marca, String modelo, Integer año, Double sumaAsegurada) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.sumaAsegurada = sumaAsegurada;
	}
	protected String getMarca() {
		return marca;
	}
	protected void setMarca(String marca) {
		this.marca = marca;
	}
	protected String getModelo() {
		return modelo;
	}
	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}
	protected Integer getAño() {
		return año;
	}
	protected void setAño(Integer año) {
		this.año = año;
	}
	protected Double getSumaAsegurada() {
		return sumaAsegurada;
	}
	protected void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}
	
	
	
}
