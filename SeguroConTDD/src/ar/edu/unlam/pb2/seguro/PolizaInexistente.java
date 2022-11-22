package ar.edu.unlam.pb2.seguro;

public class PolizaInexistente extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PolizaInexistente (String mensaje) {
		super(mensaje);
	}

}
