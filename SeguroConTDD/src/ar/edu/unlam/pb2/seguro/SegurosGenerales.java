package ar.edu.unlam.pb2.seguro;

public class SegurosGenerales  extends Poliza{
	private Auto auto;
//	private Vivienda vivienda;
	
	public SegurosGenerales(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima);
		this.auto=null;
//		this.vivienda=null;
	
	}
	
	public void agregarBienAsegurado(Auto auto) {
		this.auto=auto;
		
	}

	public Auto getAuto() {
				return this.auto;
	}

}
