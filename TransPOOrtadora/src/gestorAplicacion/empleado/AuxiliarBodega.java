package gestorAplicacion.empleado;

import java.util.ArrayList;
import java.util.Scanner;
import static uiMain.uiMain.empleados;

public class AuxiliarBodega extends Empleado {
	public String rol;
	public static ArrayList<AuxiliarBodega> auxiliarBodegas = new ArrayList<>();// recepción, almacenamiento y preparación para la distribución de productos,

	public AuxiliarBodega(String nombre, int documento, String rol) {
		super(nombre, documento);
		this.rol = rol;
		auxiliarBodegas.add(this);
	}

	@Override
	public String toString() {
		return "AuxiliarBodega{" +
				"Nombre='" + getNombre() + '\'' +
				"Documento='" + getDocumento() + '\'' +
				"rol='" + rol + '\'' +
				'}';
	}

	void Salario() {
		System.out.println("Calcular salario");
	}

	public static void AuxBodega() {
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		String option;
		while(true) {
			System.out.println();
			System.out.println("-----------------------------");
			System.out.println("En este apartado podra ver toda la informacion acerca de auxiliar de bodega");
			System.out.println("Escoja una opcion:");
			System.out.println("1. ver todos los auxiliares de bodega.");
			System.out.println("2. agregar auxiliar de bodega.");
			System.out.println("3. eliminar auxiliar de bodega.");
			System.out.println("0. Salir.");
			System.out.println("-----------------------------");
			System.out.println();
			option = in.next();
			if (option.equals("1")) {
				if(auxiliarBodegas.size()==0){
					System.out.println("no hay ningun auxiliar de bodega");
				}
				for (AuxiliarBodega auxiliarBodega : auxiliarBodegas) {
					System.out.println(auxiliarBodega);
				}
			}else if (option.equals("2")) {
				System.out.println(" Ingrese el nombre del auxiliar.");
				String nombre= in.next();
				System.out.println(" Ingrese el documento del auxiliar.");
				int documento=in.nextInt();
				for (Integer empleado : empleados) {
					if(empleado==documento){
						System.out.println("Ya existe un empleado con este documento");
						return;
					}
				}
				System.out.println(" Escoga el rol del auxiliar de bodega");
				System.out.println("1. Recepcion.");
				System.out.println("2. Almacenaiento.");
				System.out.println("2. Distribucion de productos.");
				String opcion= in.next();
				if(opcion.equals("1")){
					empleados.add(documento);
					AuxiliarBodega newAuxiliarBodega=new AuxiliarBodega(nombre,documento,"recepcion");
				}else if(opcion.equals("2")){
					empleados.add(documento);
					AuxiliarBodega newAuxiliarBodega=new AuxiliarBodega(nombre,documento,"almacenamiento");
				}else if(opcion.equals("3")){
					empleados.add(documento);
					AuxiliarBodega newAuxiliarBodega=new AuxiliarBodega(nombre,documento,"distribucion");
				}else{
					System.out.println("respuesta invalida");
					return;
				}
				System.out.println(" Registro Exitoso");
			}else if(option.equals("3")){
				System.out.println(" Ingrese el documento del auxiliar que desea eliminar");
				int docElim= in.nextInt();
				for (AuxiliarBodega auxiliarBodega : auxiliarBodegas) {
					if(auxiliarBodega.getDocumento()==docElim){
						auxiliarBodegas.remove(auxiliarBodega);
						System.out.println("Empleado eliminado con exito");
						break;
					}
				}
			}else if(option.equals("0")){
				return;
			}
		}
	}



}
