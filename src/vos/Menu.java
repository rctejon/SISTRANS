package vos;

import java.util.ArrayList;

public class Menu extends Producto{

	private ArrayList<ProductoSingular> productos;
	

	public Menu(Long id, double precio, TipoProducto tipo, ArrayList<ProductoSingular> productos) {
		super(id, precio, tipo);
		this.productos = productos;
	}

	public ArrayList<ProductoSingular> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<ProductoSingular> productos) {
		this.productos = productos;
	}
	
	
}