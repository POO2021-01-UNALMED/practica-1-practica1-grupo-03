package gestorAplicacion;

public class montaCarga {
	private String tipo;
	private int capacidad;
	
	public montaCarga(String tipo,int capacidad) {
		this.tipo=tipo;
		this.capacidad=capacidad;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}

