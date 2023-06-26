package Inmobiliaria;

public class Propiedad {
	
	String domicilio;
	int precio;
	tipoPropiedad tipo;
	
	
	Propiedad(String domicilio, int precio, tipoPropiedad tipo){
		this.domicilio = domicilio;
		this.precio = precio;
		this.tipo = tipo;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public int getPrecio() {
		return precio;
	}


	public tipoPropiedad getTipo() {
		return tipo;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}




	
	

}
