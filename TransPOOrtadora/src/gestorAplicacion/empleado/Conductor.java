package gestorAplicacion.empleado;

import java.util.ArrayList;
import java.util.Scanner;

import static uiMain.uiMain.empleados;

public class Conductor extends Empleado {
    public static ArrayList<Conductor> conductores = new ArrayList<>();
    private final String tipoVehiculo;

    public Conductor(String nombre, int documento, String tipoVehiculo) {
        super(nombre, documento);
        this.tipoVehiculo=tipoVehiculo;
        conductores.add(this);
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "Nombre='" + getNombre() + '\'' +
                "Documento='" + getDocumento() + '\'' +
                "Tipo de Vehiculo='" + tipoVehiculo + '\'' +
                '}';
    }


    @Override
    void Salario() {
        System.out.println("Calcular salario");
    }


    public static void conductor() {
        @SuppressWarnings("resource")
        Scanner in=new Scanner(System.in);
        String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("En este apartado podra ver toda la informacion acerca de conductores");
            System.out.println("Escoja una opcion:");
            System.out.println("1. ver todos los conductores.");
            System.out.println("2. agregar conductor.");
            System.out.println("3. eliminar conductor.");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            if (option.equals("1")) {
                if(conductores.size()==0){
                    System.out.println("no hay ningun conductor");
                }
                for (Conductor conductor : conductores) {
                    System.out.println(conductor);
                }
            }else if (option.equals("2")) {
                System.out.println(" Ingrese el nombre del conductor.");
                String nombre= in.next();
                System.out.println(" Ingrese el documento del conductor.");
                int documento=in.nextInt();
                for (Integer empleado : empleados) {
                    if(empleado==documento){
                        System.out.println("Ya existe un empleado con este documento");
                        return;
                    }
                }
                System.out.println(" Escoga el tipo de vehiculo del conductor");
                System.out.println("1. Alimento.");
                System.out.println("2. Liviano.");
                System.out.println("2. Pesado(remolque).");
                String opcion= in.next();
                if(opcion.equals("1")){
                    empleados.add(documento);
                    Conductor newConductor=new Conductor(nombre,documento,"alimento");
                }else if(opcion.equals("2")){
                    empleados.add(documento);
                    Conductor newConductor=new Conductor(nombre,documento,"liviano");
                }else if(opcion.equals("3")){
                    empleados.add(documento);
                    Conductor newConductor=new Conductor(nombre,documento,"pesado");
                }else{
                    System.out.println("respuesta invalida");
                    return;
                }
                System.out.println(" Registro Exitoso");
            }else if(option.equals("3")){
                System.out.println(" Ingrese el documento del conductor que desea eliminar");
                int docElim= in.nextInt();
                for (Conductor conductor : conductores) {
                    if(conductor.getDocumento()==docElim){
                        conductores.remove(conductor);
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
