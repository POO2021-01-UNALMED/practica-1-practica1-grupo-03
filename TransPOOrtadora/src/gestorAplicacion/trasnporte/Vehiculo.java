package gestorAplicacion.trasnporte;

import baseDatos.Deserializador;
import java.io.Serializable;
import java.util.ArrayList;

public class Vehiculo implements Serializable {

	private static final long serialVersionUID=1L;
	protected String placa;
	protected String marca;
	protected int capacidad;

	public static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
	
	public Vehiculo(String placa,String marca,int capacidad) {
		this.placa=placa;
		this.marca=marca;
		this.capacidad=capacidad;
		vehiculos.add(this);
	}

	public Vehiculo(){
		Deserializador.deserializar(this);
	}

	public static ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	public static void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		Vehiculo.vehiculos = vehiculos;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Vehiculo{" +
				"placa='" + placa + '\'' +
				", marca='" + marca + '\'' +
				", capacidad=" + capacidad +
				'}';
	}

	public static void verVehiculos() {
		if(vehiculos.size()==0){
			System.out.println("no hay ningun vehiculo");
		}
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo);
		}
	}



}