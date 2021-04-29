package gestorAplicacion;
import java.util.ArrayList;


public class Bodega {
	private int capacidad;
	static ArrayList<Bodega> cargas = new ArrayList<>();

	public Bodega(int capacidad) {
		this.capacidad=capacidad;
		cargas.add(this);
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
}

