package vos;

import java.util.ArrayList;

public class ProductoSingular extends Producto{

	private double cantidadDisponible;
	
	private String nombre;
	
	private String descripcion;
	
	private String descripcionTraducida;
	
	private double tiempoDePreparacion;
	
	private double costoProduccion;

	private ArrayList<Ingrediente> ingredientes;
	
	private ArrayList<ProductoSingular> productosEquivalentes;
	
	private TipoProductoSigular tipoProdSing;
	
	public enum TipoProductoSigular{
		ENTRADA, PLATO_FUERTE, BEBIDA, POSTRE, ACOMPAŅAMIENTO
	}

	public ProductoSingular(Long id, double precio, TipoProducto tipo, double cantidadDisponible, String nombre,
			String descripcion, String descripcionTraducida, double tiempoDePreparacion, double costoProduccion,
			ArrayList<Ingrediente> ingredientes, ArrayList<ProductoSingular> productosEquivalentes,
			TipoProductoSigular tipoProdSing) {
		super(id, precio, tipo);
		this.cantidadDisponible = cantidadDisponible;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.descripcionTraducida = descripcionTraducida;
		this.tiempoDePreparacion = tiempoDePreparacion;
		this.costoProduccion = costoProduccion;
		this.ingredientes = ingredientes;
		this.productosEquivalentes = productosEquivalentes;
		this.tipoProdSing = tipoProdSing;
	}

	public ArrayList<ProductoSingular> getProductosEquivalentes() {
		return productosEquivalentes;
	}

	public void setProductosEquivalentes(ArrayList<ProductoSingular> productosEquivalentes) {
		this.productosEquivalentes = productosEquivalentes;
	}

	public double getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(double cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcionTraducida() {
		return descripcionTraducida;
	}

	public void setDescripcionTraducida(String descripcionTraducida) {
		this.descripcionTraducida = descripcionTraducida;
	}

	public double getTiempoDePreparacion() {
		return tiempoDePreparacion;
	}

	public void setTiempoDePreparacion(double tiempoDePreparacion) {
		this.tiempoDePreparacion = tiempoDePreparacion;
	}

	public double getCostoProduccion() {
		return costoProduccion;
	}

	public void setCostoProduccion(double costoProduccion) {
		this.costoProduccion = costoProduccion;
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public TipoProductoSigular getTipoProdSing() {
		return tipoProdSing;
	}

	public void setTipoProdSing(TipoProductoSigular tipoProdSing) {
		this.tipoProdSing = tipoProdSing;
	}
	
	
}
