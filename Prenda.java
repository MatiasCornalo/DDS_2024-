class Prenda{
	String tipo;
	Categoria categoria;  
	String material;
	String colorPrincipal;
	String colorSecundario;
	
	
	// Constructor de la prenda
	Prenda(String tipo, Categoria categoria, String material, String colorPrincipal) {
	        this.tipo = tipo;
	        this.categoria = categoria;
	        this.material = material;
	        this.colorPrincipal = colorPrincipal;
	        this.colorSecundario = null; // Color secundario se inicializa como null
	}
	
	// Setter opcional del color secundario
	void colorSecundario(String  color_nuevo) {
		this.colorSecundario = color_nuevo;
	}
	 
	// Getters
	String tipo() {
		return tipo;
	}
	
	Categoria categoria() {
		return categoria;
	}
	
	String material() {
		return material;
	}
	
	String colorPrincipal() {
		return colorPrincipal;
	}
	
	String colorSecundario() {
		if(colorSecundario == null) {
			return "No tiene color secundario";
		}else {
			return colorSecundario;
		}
		
	}
	////
}
