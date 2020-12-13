package vehiculos;

import java.util.Arrays;
import java.util.Collection;

public class UsandoLibreria {

	  public static void main(String[] args) {
	    ProductExterno productoExterno = new ProductExterno("CocheRaro", 25000f);
	    CocheProducto cocheProducto = new CocheProducto("Seat", "Blanco", 16000);
		
	    System.out.println("Usando Comerciable");
	    Collection<Comerciable> productos = Arrays.asList(
	                productoExterno,
	                cocheProducto
	        );

	    productos.forEach(System.out::println);
	    System.out.println(getValorTotal(productos));

	  }

	  private static float getValorTotal(Collection<Comerciable> comerciables) {
	    return (float)comerciables.stream().mapToDouble(UsandoLibreria::toDouble).sum();
	  }

	  private static Double toDouble(Comerciable comerciable) {
	    return new Double(comerciable.getPrecio());
	  }

	}