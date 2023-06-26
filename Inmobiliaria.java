package Inmobiliaria;
import java.util.ArrayList;

public class Inmobiliaria {

	
	ArrayList <Barrio> barrios = new ArrayList<>();
	
	
	
	Inmobiliaria(){
		this.barrios = barrios;
	}
	
	
	public void mostrarPropiedades() {
		
		for(Barrio barrio : barrios) {
			
			for(Propiedad propiedad : barrio.getPropiedades()) {
				
				System.out.print(propiedad.getDomicilio());
				System.out.print(propiedad.getPrecio());
				
			}
		}
	}
	

	public ArrayList<Barrio> obtenerBarrioMaxProp() {
		
	    int maxPropiedades = 0;
	    ArrayList<Barrio> barriosMaxProp = new ArrayList<>();

	    for (Barrio barrio : barrios) {
	        int cantidadPropiedades = barrio.getPropiedades().size();
	        
	        if (cantidadPropiedades > maxPropiedades) {
	            maxPropiedades = cantidadPropiedades;
	            barriosMaxProp.clear();
	            barriosMaxProp.add(barrio);
	            
	        } else if (cantidadPropiedades == maxPropiedades) {
	            barriosMaxProp.add(barrio);
	        }
	    }

	    return barriosMaxProp;
	}
	
	
	public void cambiarPropiedaddeBarrio(String domicilio, Barrio barrio) {
			
		
		
	}

	
	public void eliminarPropiedad(String domicilio) {
		
		
			
	}
	

		
		
		
	
	
}
