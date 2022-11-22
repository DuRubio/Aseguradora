package ar.edu.unlam.pb2.seguro;

import java.util.HashSet;
import java.util.Set;

public class CompaniaDeSeguro {
	private String nombre;
	private Set<Poliza> polizas;

	public CompaniaDeSeguro(String nombre) {
		super();
		this.nombre = nombre;
		polizas = new HashSet<Poliza>();
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarPoliza(Poliza poliza) {
		polizas.add(poliza);

	}

	public Integer obtenerLaCantidadDePolizasEmitidas() {
		// TODO Auto-generated method stub
		return polizas.size();
	}

	public void denunciarSiniestro(int nroPoliza) throws PolizaInexistente {
		if (buscarPoliza(nroPoliza) == true) {
			getPoliza(nroPoliza).setSiniestro(true);
		} else {
			throw new PolizaInexistente("La poliza buscada no existe");
		}
	

	}

	public Boolean buscarPoliza(int nroPoliza) {
		for (Poliza poliza : polizas) {
			if (poliza.getNumeroDePoliza() == nroPoliza)
				return true;
		}

		return false;
	}

	public Poliza getPoliza(int nroPoliza) {
		if (buscarPoliza(nroPoliza)) {
			for (Poliza poliza : polizas) {
				if (poliza.getNumeroDePoliza() == nroPoliza) {
					return poliza;
				}
			}
		}
		return null;
	}

}
