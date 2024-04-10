class Atuendo {
	Prenda[] prendas;
	int cantidadPrendas = 0;
	
	Atuendo(Prenda[] prendasNuevas){
		this.prendas = prendasNuevas;
	}
	
	
	// Muestra la lista de prendas del atuendo
	Prenda[] prendas() {
		return prendas;
	}
	
	//  Por si quiero agregar una prenda a mi  lista de prendas
	void agregoPrenda(Prenda prenda_nueva) {
		 prendas[cantidadPrendas] = prenda_nueva;
	     cantidadPrendas++;
	}
}

// prenda es una sola prenda
// prenda[] es una lista de prendas


// Comenzamos por los autuendos, elegi modelarlos  enn baasae a una clase "atuendo" que tiene como variable una lista de prendas
// Cada atuendo conoce laas prendas que tiene