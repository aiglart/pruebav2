package vehiculos;



public class Coche extends Vehiculo {
	int numeroDeRuedas;
	String descripcion;
	String modelo;
	  // Codigo sin los miembros de Vehiculo
	public Coche (String color, String modelo) {
	    super(color, modelo);
	     numeroDeRuedas = 4;
	  }
	public int getNumeroDeRuedas() {
		return numeroDeRuedas;
	}
	public void setNumeroDeRuedas(int numeroDeRuedas) {
		this.numeroDeRuedas = numeroDeRuedas;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modeloString) {
		this.modelo = modeloString;
	}
	
	
	
	}