package vehiculos;

public class Vehiculo {

    protected String modelo;
    String color;

    public Vehiculo() {
        super();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public Vehiculo(String modelo, String color) {
	    this.modelo = modelo;
	    this.color = color;
	}

}