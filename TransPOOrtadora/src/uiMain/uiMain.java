package uiMain;

import gestorAplicacion.Bodega;
import gestorAplicacion.Carga;
import gestorAplicacion.Ruta;

import java.util.*;

import static gestorAplicacion.Bodega.agregarCargaBodega;
import static gestorAplicacion.Bodega.verBodega;
import static gestorAplicacion.Carga.*;
import static gestorAplicacion.CentroDespacho.despachoVehiculo;
import static gestorAplicacion.Ruta.*;
import static gestorAplicacion.empleado.AuxiliarBodega.AuxBodega;
import static gestorAplicacion.empleado.Conductor.conductor;
import static gestorAplicacion.empleado.Montacarguista.montacarguista;
import static gestorAplicacion.trasnporte.Vehiculo.verVehiculos;
import static gestorAplicacion.trasnporte.VehiculoAlimento.vehiculoAlimento;
import static gestorAplicacion.trasnporte.VehiculoLiviano.vehiculoLiviano;
import static gestorAplicacion.trasnporte.VehiculoPesado.vehiculoPesado;

public class uiMain {
    public static ArrayList<Integer> empleados = new ArrayList<>();
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(true) {
			System.out.println();
			System.out.println("-----------------------------");
			System.out.println("Bienvenido a TransPOOrtadora : "); 
			System.out.println("Escoja una opcion:");
            System.out.println("1. Ver Centro de despacho.");
            System.out.println("2. Ver Vehiculos.");
			System.out.println("3. Ver Bodega.");
			System.out.println("4. Ver Carga.");
			System.out.println("5. Ver Ruta.");
            System.out.println("6. Ver Empleados.");
			System.out.println("0. Salir.");
			System.out.println("-----------------------------");
			System.out.println();
			String option = input.next();
	            if (option.equals("1")) {
                    opcionCentroDespacho();
	            }else if (option.equals("2")) {
                    opcionVehiculos();
	            }else if(option.equals("3")){
                    opcionBodega();
	            }else if (option.equals("4")) {
                    opcionCarga();
	            }else if(option.equals("5")){
                    opcionRuta();
	            }else if(option.equals("6")){
                    opcionEmpleado();
                }else if(option.equals("0")){
	                //salirDelsistema(centroDespacho);
	                break;
	            }
	        }
	}

    private static void opcionEmpleado() {
        @SuppressWarnings("resource")
        Scanner in=new Scanner(System.in);
        String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("En este apartado podrá ver toda la información acerca de los empleados de la empresa");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Auxilixiar de bodega.");
            System.out.println("2. Conductor.");
            System.out.println("3. Montacarguista.");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            if (option.equals("1")) {
                AuxBodega();
            }else if (option.equals("2")) {
                conductor();
            }else if(option.equals("3")){
                montacarguista();
            }else if(option.equals("0")){
                break;
            }
        }
    }

    private static void opcionCentroDespacho() {
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("En este apartado podrá ver toda la información acerca del Centro de despacho");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Despachar vehiculo.");
            System.out.println("2. Ver vehiculos.");
            System.out.println("3. Ver cargas.");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            if (option.equals("1")) {
                despachoVehiculo();
            }else if (option.equals("2")) {
                
            }else if(option.equals("3")){
               
            }else if(option.equals("0")){
                break;
            }
        }
	}



    private static void opcionRuta() {
        listaRutas();
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
                Ruta.verRutas();
            }else if (option.equals("2")) {
                opcionAgregarRuta();
            }else if(option.equals("3")){
                elimRuta();
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
            System.out.println("En este apartado podra ver toda la informacion acerca de Carga");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Ver cargas.");
            System.out.println("2. Agregar carga.");
            System.out.println("3. Eliminar carga.");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            if (option.equals("1")) {
                verCargas();
            }else if (option.equals("2")) {
                agregarCargas();
            }else if(option.equals("3")){
                elimCargas();
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
            System.out.println("1. Informacion Bodegas.");
            System.out.println("2. Agregar carga a bodega.");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            if (option.equals("1")) {
                verBodega();
            }else if (option.equals("2")) {
                agregarCargaBodega();
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
            System.out.println("1. vehiculo de alimento.");
            System.out.println("2. vehiculo liviano.");
            System.out.println("3. vehiculo pesado.");
            System.out.println("4. ver todos los vehiculos registrados.");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            if (option.equals("1")) {
                vehiculoAlimento();
            }else if (option.equals("2")) {
                vehiculoLiviano();
            }else if(option.equals("3")){
                vehiculoPesado();
            }else if(option.equals("4")){
                verVehiculos();
            }else if(option.equals("0")){
                break;
            }
        }
	}


    //private static void salirDelsistema(CentroDespacho centroDespacho) {
    //    System.out.println("¡Vuelva pronto!");
    //    Serializadora.serializacion(centroDespacho);
    //}

}
