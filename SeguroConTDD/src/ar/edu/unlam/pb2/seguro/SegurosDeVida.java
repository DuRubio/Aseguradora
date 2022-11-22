package ar.edu.unlam.pb2.seguro;

import java.util.HashMap;
import java.util.Map;

public class SegurosDeVida extends Poliza{
	private Map <Persona, TipoDeBeneficiario> beneficiarios;
	
	
	
	public SegurosDeVida(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima);
		beneficiarios = new HashMap<>();
				
		
	}

	public void agregarBeneficiario(Persona beneficiario , TipoDeBeneficiario relacionFamiliar) {
		beneficiarios.put(beneficiario, relacionFamiliar);
		
	}

	public Integer obtenerCantidadDeBeneficiarios() {
		// TODO Auto-generated method stub
		return beneficiarios.size();
	}
	
	

}
