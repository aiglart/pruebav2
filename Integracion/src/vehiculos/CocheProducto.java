package vehiculos;

import com.github.commerce.Merchantable;

public class CocheProducto extends Coche implements Comerciable {

  private float precio;

  @Override
  public float getPrecio() {
    return precio;
  }

  public CocheProducto(String modelo, String color, float precio) {
    super(modelo, color);
    this.precio = precio;
  }

  @Override
  public String getDescripcion() {
    return getModelo();
  }





}