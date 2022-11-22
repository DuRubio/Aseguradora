package ar.edu.unlam.pb2.seguro;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PolizaCombinadoFamiliar extends Poliza{
	private Map<Persona,TipoDeBeneficiario> beneficiarios;
	private Set<Vivienda> bienAsegurado;
	
	

	public PolizaCombinadoFamiliar(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima);
		beneficiarios = new HashMap<>();
		bienAsegurado = new HashSet<>();
	}

	public void agregarBeneficiario(Persona beneficiario, TipoDeBeneficiario relacionFamiliar) {
		beneficiarios.put(beneficiario, relacionFamiliar);
		
	}

	public void agregarBienAsegurado(Vivienda casa) {
		bienAsegurado.add(casa);
		
	}

	public Object obtenerCantidadDeBeneficiario() {
		return beneficiarios.size();
	}

}
