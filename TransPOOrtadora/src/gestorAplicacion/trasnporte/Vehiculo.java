package gestorAplicacion.trasnporte;

import gestorAplicacion.Carga;

import java.util.ArrayList;

public class Vehiculo {
	protected String placa;
	protected String marca;
	protected int capacidad;

	static ArrayList<Vehiculo> Vehiculos = new ArrayList<>();
	
	public Vehiculo(String placa,String marca,int capacidad) {
		this.placa=placa;
		this.marca=marca;
		this.capacidad=capacidad;
		Vehiculos.add(this);
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


	public void CargarVehiculo(Carga carga){
		if (carga.getTipo().equals("Alimento")){
			buscarAuto();

		} else if(carga.getTipo().equals("Liviano")){
			System.out.println(12);
		} else{
			System.out.println(12);
		}

	}

	private void buscarAuto() {
	}


}