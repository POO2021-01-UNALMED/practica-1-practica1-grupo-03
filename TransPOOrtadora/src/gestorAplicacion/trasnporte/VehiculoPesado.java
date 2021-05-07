package gestorAplicacion.trasnporte;

import java.util.ArrayList;
import java.util.Scanner;

//import static uiMain.uiMain.vehiculos;

public class VehiculoPesado extends Vehiculo{

    private boolean tipoRemolque;
    public static ArrayList<VehiculoPesado> vehiculosPesados = new ArrayList<>();

    public VehiculoPesado(String placa, String marca, int capacidad, boolean tipoRemolque) {
        super(placa, marca, capacidad);
        this.tipoRemolque = tipoRemolque;
        vehiculosPesados.add(this);
    }

    public boolean getTipoRemolque() {
        return tipoRemolque;
    }

    public void setTipoRemolque(boolean tipoRemolque) {
        this.tipoRemolque = tipoRemolque;
    }

    @Override
    public String toString() {
        return "VehiculoPesado{" +
                "tipoRemolque='" + tipoRemolque + '\'' +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }

    public static void vehiculoPesado() {
        @SuppressWarnings("resource")
        Scanner in=new Scanner(System.in);
        String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("En este apartado podra ver toda la informacion acerca de vehiculos de tipo pesado(remolque)");
            System.out.println("Escoja una opcion:");
            System.out.println("1. ver todos los vehiculos de tipo pesado.");
            System.out.println("2. agregar vehiculo pesado.");
            System.out.println("3. eliminar vehiculo pesado.");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            if (option.equals("1")) {
                if(vehiculosPesados.size()==0){
                    System.out.println("no hay vehiculos registrados");
                }
                for (VehiculoPesado vehiculoPesado : vehiculosPesados) {
                    System.out.println(vehiculoPesado);
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
                System.out.println(" ¿Es un vehiculo tipo pesado(remolque)?");
                System.out.println("1. Si.");
                System.out.println("2. No.");
                String opcion= in.next();
                if(opcion.equals("1")){
                    //Vehiculo newVehiculo=new Vehiculo(placa,marca,capacidad);
                    //vehiculos.add(newVehiculo);
                    VehiculoPesado newVehiculoPesado=new VehiculoPesado(placa,marca,capacidad,true);
                }else if(opcion.equals("2")){
                    //Vehiculo newVehiculo=new Vehiculo(placa,marca,capacidad);
                    //vehiculos.add(newVehiculo);
                    VehiculoPesado VehiculoPesado=new VehiculoPesado(placa,marca,capacidad,false);
                }else{
                    System.out.println("respuesta invalida");
                    return;
                }
                System.out.println(" Registro Exitoso");
            }else if(option.equals("3")){
                System.out.println(" Ingrese la placa del vehiculo que desea eliminar");
                String autoElim= in.next();
                for (VehiculoPesado vehiculoPesado : vehiculosPesados) {
                    if(vehiculoPesado.getPlaca().equals(autoElim)){
                        vehiculosPesados.remove(vehiculoPesado);
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
