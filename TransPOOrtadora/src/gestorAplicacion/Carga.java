package gestorAplicacion;
import java.util.ArrayList;
import java.util.Scanner;

public class Carga {
	private int referencia;
	private String tipo;
	private int peso;
	private double volumen;
	public static ArrayList<Carga> cargas = new ArrayList<>();

	public Carga(int referencia,String tipo, int peso, double volumen) {
		this.referencia = referencia;
		this.tipo=tipo;
		this.peso=peso;
		this.volumen=volumen;
		cargas.add(this);
	}
		
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public double getVolumen() {
		return volumen;
	}
	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}
	public int getReferencia() {
		return referencia;
	}
	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}

	@Override
	public String toString() {
		return "Carga{" +
				"tipo='" + tipo + '\'' +
				", peso=" + peso +
				", volumen=" + volumen +
				'}';
	}

	public static void elimCargas() {
		Scanner in=new Scanner(System.in);
		System.out.println(" Ingrese la referencia de la carga que desea eliminar");
		int referencia= in.nextInt();
		for (Carga carga : cargas) {
			if(carga.getReferencia()==referencia){
				cargas.remove(carga);
				System.out.println("Carga eliminada con exito");
				break;
			}
		}
	}

	public static void agregarCargas() {
		Scanner in=new Scanner(System.in);
		System.out.println(" Ingrese la referencia de la carga.");
		int referencia=in.nextInt();
		for (Carga carga : cargas) {
			if(carga.getReferencia()==referencia){
				System.out.println("Ya existe una carga registrada con esta referencia");
				return;
			}
		}
		System.out.println(" Ingrese el tipo de carga que va a agregar.");
		String tipo= in.next();
		System.out.println(" Ingrese el peso de la carga.");
		int peso=in.nextInt();
		System.out.println(" Ingrese el volumen de la carga.");
		double volumen=in.nextInt();
		Carga newCarga=new Carga(referencia,tipo,peso,volumen);
		System.out.println(" Registro Exitoso");
	}

	public static void verCargas() {
		if(cargas.size()==0){
			System.out.println("no hay ninguna carga");
		}
		for (Carga carga : cargas) {
			System.out.println(carga);
		}
	}

}
