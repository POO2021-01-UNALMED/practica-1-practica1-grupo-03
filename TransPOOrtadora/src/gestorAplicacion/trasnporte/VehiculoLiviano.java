package gestorAplicacion.trasnporte;

import java.util.ArrayList;
import java.util.Scanner;
//import static uiMain.uiMain.vehiculos;

public class VehiculoLiviano extends Vehiculo{

    private boolean tipoLiviano;
    public static ArrayList<VehiculoLiviano> vehiculosLivianos = new ArrayList<>();

    public VehiculoLiviano(String placa, String marca, int capacidad, boolean tipoLiviano) {
        super(placa, marca, capacidad);
        this.tipoLiviano = tipoLiviano;
        vehiculosLivianos.add(this);
    }

    public boolean isTipoLiviano() {
        return tipoLiviano;
    }

    public void setTipoLiviano(boolean tipoLiviano) {
        this.tipoLiviano = tipoLiviano;
    }

    @Override
    public String toString() {
        return "VehiculoLiviano{" +
                "Vehiculo tipo liviano='" + tipoLiviano + '\'' +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }

    public static void vehiculoLiviano() {
        @SuppressWarnings("resource")
        Scanner in=new Scanner(System.in);
        String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("En este apartado podra ver toda la informacion acerca de vehiculos de tipo liviano");
            System.out.println("Escoja una opcion:");
            System.out.println("1. ver todos los vehiculos de tipo liviano.");
            System.out.println("2. agregar vehiculo liviano.");
            System.out.println("3. eliminar vehiculo liviano.");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            if (option.equals("1")) {
                if(vehiculosLivianos.size()==0){
                    System.out.println("no hay vehiculos registrados");
                }
                for (VehiculoLiviano vehiculoLiviano : vehiculosLivianos) {
                    System.out.println(vehiculoLiviano);
                }
            }else if (option.equals("2")) {
                System.out.println(" Ingrese la placa del vehiculo.");
                String placa=in.next();
                for (Vehiculo vehiculo : vehiculos) {
                    if(vehiculo.getPlaca().equals(placa)){
                        System.out.println("Ya existe un vehiculo con esa placa");
                        return;
                    }
                }
                System.out.println(" Ingrese la marca del vehiculo.");
                String marca= in.next();
                System.out.println(" Ingrese la capacidad del vehiculo");
                int capacidad= in.nextInt();
                System.out.println(" ¿Es un vehiculo de tipo liviano?");
                System.out.println("1. Si.");
                System.out.println("2. No.");
                String opcion= in.next();
                if(opcion.equals("1")){
                    //Vehiculo newVehiculo=new Vehiculo(placa,marca,capacidad);
                    //vehiculos.add(newVehiculo);
                    VehiculoLiviano newVehiculoLiviano=new VehiculoLiviano(placa,marca,capacidad,true);
                }else if(opcion.equals("2")){
                    //Vehiculo newVehiculo=new Vehiculo(placa,marca,capacidad);
                    //vehiculos.add(newVehiculo);
                    VehiculoLiviano vehiculoLiviano=new VehiculoLiviano(placa,marca,capacidad,false);
                }else{
                    System.out.println("respuesta invalida");
                    return;
                }
                System.out.println(" Registro Exitoso");
            }else if(option.equals("3")){
                System.out.println(" Ingrese la placa del vehiculo que desea eliminar");
                String autoElim= in.next();
                for (VehiculoLiviano vehiculoLiviano : vehiculosLivianos) {
                    if(vehiculoLiviano.getPlaca().equals(autoElim)){
                        vehiculosLivianos.remove(vehiculoLiviano);
                        System.out.println("vehiculo eliminado con exito");
                        break;
                    }
                }
            }else if(option.equals("0")){
                return;
            }
        }
    }
}
