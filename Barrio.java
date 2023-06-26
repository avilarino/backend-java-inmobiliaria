package Inmobiliaria;
import java.util.ArrayList;

public class Barrio {
	
	String nombre;
	ArrayList <Propiedad> propiedades = new ArrayList<>();
	
	
	Barrio(String nombre){
		this.nombre = nombre;
		this.propiedades = propiedades;
	}
	
	
	public Propiedad buscarPropiedades(String domicilio) {

		Propiedad propiedadBuscada = null;
		int i = 0;

		while (i < this.propiedades.size() && propiedadBuscada == null) {
			if (this.propiedades.get(i).getDomicilio().equalsIgnoreCase(domicilio)) {
				propiedadBuscada = this.propiedades.get(i);
			}
			i++;
		}
		return propiedadBuscada;

	}

	public boolean agregarPropiedades(String domicilio, int precio, tipoPropiedad tipo) {
		
		Propiedad propiedadAgregar = this.buscarPropiedades(domicilio);
		boolean agregada = false;
		
		if(propiedadAgregar == null) {
			
			Propiedad propiedadNueva = new Propiedad(domicilio, precio, tipo);
			this.propiedades.add(propiedadNueva);
			agregada = true;
		}
		
		return agregada;
		
	}

	public void mostrarPropiedades(tipoPropiedad tipo) {
		
		for(Propiedad propiedad : propiedades) {
			
			if(propiedad.getTipo() == tipo) {
				System.out.print("la propiedad es" + propiedad.getDomicilio() + "" + propiedad.getPrecio() + "" + propiedad.getTipo());
			}
			
		}
		
		
	}


	public ArrayList<Propiedad> getPropiedades() {
		return propiedades;
	}
	
	
	

}
