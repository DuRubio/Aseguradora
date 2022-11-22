package ar.edu.unlam.pb2.seguro;

public class Poliza {
	private Integer numeroDePoliza;
	private Persona asegurado;
	private Double sumaAsegurada;
	private Double prima;
	private Boolean fueRobada;
	private Boolean tuvoUnAccidente;
	
	public Poliza(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super();
		this.numeroDePoliza = numeroDePoliza;
		this.asegurado = asegurado;
		this.sumaAsegurada = sumaAsegurada;
		this.prima = prima;
		this.fueRobada=false;
	}

	protected Integer getNumeroDePoliza() {
		return numeroDePoliza;
	}

	protected void setNumeroDePoliza(Integer numeroDePoliza) {
		this.numeroDePoliza = numeroDePoliza;
	}

	protected Persona getAsegurado() {
		return asegurado;
	}

	protected void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}

	protected Double getSumaAsegurada() {
		return sumaAsegurada;
	}

	protected void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}

	protected Double getPrima() {
		return prima;
	}

	protected void setPrima(Double prima) {
		this.prima = prima;
	}

	public Boolean fueRobado() {
		return fueRobada;
	}

	public void setSiniestro(boolean b) {
		this.fueRobada=b;
		
	}

	public boolean tuvoAlgunAccidente() {
		if(fueRobado()==false) {
			setTuvoUnAccidente(false);
		} else {
			setTuvoUnAccidente(true);
		}
		
		return tuvoUnAccidente;
	}

	public void setTuvoUnAccidente(Boolean tuvoUnAccidente) {
		this.tuvoUnAccidente = tuvoUnAccidente;
	}
	
	
	
	
}
