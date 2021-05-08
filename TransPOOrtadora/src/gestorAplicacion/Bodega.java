package gestorAplicacion;

import java.util.ArrayList;
import java.util.Scanner;

import static gestorAplicacion.Carga.cargas;

public class Bodega {
	private int capacidad;
	public ArrayList<Carga> carga;
	public static ArrayList<Bodega> bodegas = new ArrayList<>();

	public Bodega(int capacidad) {
		this.capacidad=capacidad;
		carga=new ArrayList<>();
		bodegas.add(this);
	}

	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Bodega{" +
				"capacidad=" + capacidad +
				", carga=" + carga +
				'}';
	}

	public static void verBodega() {
		if(bodegas.size()==0){
			System.out.println("no hay ninguna bodega");
		}
		for (Bodega bodega : bodegas) {
			System.out.println(bodega);
		}
	}

	public static void agregarCargaBodega() {
		Scanner in=new Scanner(System.in);
		System.out.println(" Ingrese la capacidad de la bodega.");
		int capacidad=in.nextInt();
		System.out.println(" Ingrese la referencia de la carga que desea agregar.");
		int referencia=in.nextInt();
		for (Carga carga : cargas) {
			if(carga.getReferencia()==referencia){
				Bodega newBodega=new Bodega(capacidad);
				newBodega.carga.add(carga);
				System.out.println("Carga agregada con exito");
				break;
			}
		}
	}



}

