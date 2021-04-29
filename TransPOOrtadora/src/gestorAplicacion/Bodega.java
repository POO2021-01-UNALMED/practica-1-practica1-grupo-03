package gestorAplicacion;
import java.util.ArrayList;

public class Bodega {
	private int capacidad;
	private ArrayList<Carga> cargas = new ArrayList<Carga>();
	
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public ArrayList<Carga> getCargas() {
		return cargas;
	}
	public void setCargas(ArrayList<Carga> cargas) {
		this.cargas = cargas;
	}
	
	
}

