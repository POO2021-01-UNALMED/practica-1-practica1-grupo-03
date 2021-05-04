package uiMain;
import java.util.*;
//import gestorAplicacion.Vehiculo;

public class uiMain {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(true) {
			System.out.println();
			System.out.println("-----------------------------");
			System.out.println("Bienvenido a TransPOOrtadora : "); 
			System.out.println("Escoja una opcion:");
			System.out.println("1. Ver Vehiculos.");
			System.out.println("2. Ver Bodega.");  
			System.out.println("3. Ver Carga."); 
			System.out.println("4. Ver Ruta.");    
			System.out.println("5. Ver Centro logistico.");      
			System.out.println("0. Salir.");
			System.out.println("-----------------------------");
			System.out.println();
			String option = input.next();
	            if (option.equals("1")) {
	            	opcionVehiculos();
	            }else if (option.equals("2")) {
	            	opcionBodega();
	            }else if(option.equals("3")){
	            	opcionCarga();
	            }else if (option.equals("4")) {
	            	opcionRuta();
	            }else if(option.equals("5")){
	            	opcionCentroLogistico();
	            }else if(option.equals("0")){
	                break;
	            }
	        }
	}

	private static void opcionCentroLogistico() {
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("En este apartado podrá ver toda la información acerca de Centro logistico");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Informacion acerca del centro logistico.");
            System.out.println("2. Agregar centro logistico.");
            System.out.println("3. Eliminar centro logistico.");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            if (option.equals("1")) {
               
            }else if (option.equals("2")) {
                
            }else if(option.equals("3")){
               
            }else if(option.equals("0")){
                break;
            }
        }
	}

	private static void opcionRuta() {
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("En este apartado podrá ver toda la información acerca de Ruta");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Ver rutas.");
            System.out.println("2. Agregar rutas.");
            System.out.println("3. Eliminar rutas.");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            if (option.equals("1")) {
               
            }else if (option.equals("2")) {
                
            }else if(option.equals("3")){
               
            }else if(option.equals("0")){
                break;
            }
        }
	}

	private static void opcionCarga() {
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("En este apartado podrá ver toda la información acerca de Carga");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Tipos de carga.");
            System.out.println("2. Agregar carga.");
            System.out.println("3. Eliminar carga.");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            if (option.equals("1")) {
               
            }else if (option.equals("2")) {
                
            }else if(option.equals("3")){
               
            }else if(option.equals("0")){
                break;
            }
        }
	}

	private static void opcionBodega() {
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("En este apartado podrá ver toda la información acerca de Bodega");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Informacion Bodega.");
            System.out.println("2. Agregar bodega.");
            System.out.println("3. Eliminar bodega.");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            if (option.equals("1")) {
               
            }else if (option.equals("2")) {
                
            }else if(option.equals("3")){
               
            }else if(option.equals("0")){
                break;
            }
        }
	}

	private static void opcionVehiculos() {
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("En este apartado podrá ver toda la información acerca de Vehiculos");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Tipos de vehiculos.");
            System.out.println("2. Agregar vehiculo.");
            System.out.println("3. Eliminar vehiculo.");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            if (option.equals("1")) {
               
            }else if (option.equals("2")) {
                
            }else if(option.equals("3")){
               
            }else if(option.equals("0")){
                break;
            }
        }
	}

}
