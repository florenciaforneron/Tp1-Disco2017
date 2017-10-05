package ar.edu.unlam.pb2.disco2017;

public class Disco {
	
	private Double radioInterior;
	private Double radioExterior;
	
	
	public Disco(Double radioInterior, Double radioExterior){
		this.radioExterior=radioExterior;
		this.radioInterior=radioInterior;
	}
	
	public Double calcularPerimetroInterior(){
		return  (2*Math.PI)*this.radioInterior;
	}
	
	public Double calcularPerimetroExterior(){
		return (2*Math.PI)*this.radioExterior;
	}
	
	public Double calcularSuperficie(){
		return Math.PI*(this.radioExterior*this.radioExterior);
	}

	
	
	
	// GETTERS Y SETTERS
	
	
	
	public Double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}

	public Double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}
}
