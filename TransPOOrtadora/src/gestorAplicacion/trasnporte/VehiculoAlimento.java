package gestorAplicacion.trasnporte;


import java.util.ArrayList;
import java.util.Scanner;

//import static uiMain.uiMain.vehiculos;

public class VehiculoAlimento extends Vehiculo{
    private boolean refrigerado;
    private double  temperatura;
    public static ArrayList<VehiculoAlimento> vehiculosAlimentos = new ArrayList<>();

    public VehiculoAlimento(String placa, String marca, int capacidad, boolean refrigerado, double temperatura) {
        super(placa, marca, capacidad);
        this.refrigerado = refrigerado;
        this.temperatura = temperatura;
        vehiculosAlimentos.add(this);
    }


    public boolean isRefrigerado() {
        return refrigerado;
    }

    public void setRefrigerado(boolean refrigerado) {
        this.refrigerado = refrigerado;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "VehiculoAlimento{" +
                "refrigerado=" + refrigerado +
                ", temperatura=" + temperatura +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }

    public static void vehiculoAlimento() {
        @SuppressWarnings("resource")
        Scanner in=new Scanner(System.in);
        String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("En este apartado podrá ver toda la información acerca de vehiculos de tipo alimento");
            System.out.println("Escoja una opcion:");
            System.out.println("1. ver todos los vehiculos de tipo alimento.");
            System.out.println("2. agregar vehiculo de alimento.");
            System.out.println("3. eliminar vehiculo de alimento.");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            if (option.equals("1")) {
                if(vehiculosAlimentos.size()==0){
                    System.out.println("no hay vehiculos registrados");
                }
                for (VehiculoAlimento vehiculoAlimento : vehiculosAlimentos) {
                    System.out.println(vehiculoAlimento);
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
                System.out.println(" ¿Es un vehiculo con refrigeracion?");
                System.out.println("1. Si.");
                System.out.println("2. No.");
                String opcion= in.next();
                if(opcion.equals("1")){
                    System.out.println(" Ingrese la temperatura del refrigerado");
                    double temperatura=in.nextDouble();
                    //Vehiculo newVehiculo=new Vehiculo(placa,marca,capacidad);
                    //vehiculos.add(newVehiculo);
                    VehiculoAlimento newvehiculoAlimento=new VehiculoAlimento(placa,marca,capacidad, true,temperatura);
                }else if(opcion.equals("2")){
                    //Vehiculo newVehiculo=new Vehiculo(placa,marca,capacidad);
                    //vehiculos.add(newVehiculo);
                    VehiculoAlimento vehiculoAlimento=new VehiculoAlimento(placa,marca,capacidad, false,0.0);
                }else{
                    System.out.println("respuesta invalida");
                    return;
                }
                System.out.println(" Registro Exitoso");
            }else if(option.equals("3")){
                System.out.println(" Ingrese la placa del vehiculo que desea eliminar");
                String autoElim= in.next();
                for (VehiculoAlimento vehiculoAlimento : vehiculosAlimentos) {
                    if(vehiculoAlimento.getPlaca().equals(autoElim)){
                        vehiculosAlimentos.remove(vehiculoAlimento);
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
