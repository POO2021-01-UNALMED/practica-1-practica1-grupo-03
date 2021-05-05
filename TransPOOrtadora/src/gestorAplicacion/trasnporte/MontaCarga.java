package gestorAplicacion.trasnporte;

public class MontaCarga extends Vehiculo{
	private String tipo;
	private int capacidad;

	public MontaCarga(String placa, String marca, int capacidad, String tipo, int capacidad1) {
		super(placa, marca, capacidad);
		this.tipo = tipo;
		this.capacidad = capacidad1;
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

