package gestorAplicacion.empleado;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import static uiMain.uiMain.empleados;
//import static uiMain.uiMain.montacarguistas;

public class Montacarguista  extends Conductor implements Serializable {
    public static ArrayList<Montacarguista> montacarguistas = new ArrayList<>();
    private final String tipoVehiculo;

    public Montacarguista(String nombre, int documento, String tipoVehiculo) {
        super(nombre, documento,tipoVehiculo);
        this.tipoVehiculo=tipoVehiculo;
        montacarguistas.add(this);
    }

    @Override
    public String toString() {
        return "Montacarguista{" +
                "Nombre='" + getNombre() + '\'' +
                "Documento='" + getDocumento() + '\'' +
                "Tipo de Vehiculo='" + tipoVehiculo + '\'' +
                '}';
    }

    public static void montacarguista() {
        @SuppressWarnings("resource")
        Scanner in=new Scanner(System.in);
        String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("En este apartado podra ver toda la informacion acerca de montacarguista");
            System.out.println("Escoja una opcion:");
            System.out.println("1. ver todos los montacarguistas.");
            System.out.println("2. agregar montacarguista.");
            System.out.println("3. eliminar montacarguista.");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            if (option.equals("1")) {
                if(montacarguistas.size()==0){
                    System.out.println("no hay ningun montacarguista");
                }
                for (Montacarguista montacarguista : montacarguistas) {
                    System.out.println(montacarguista);
                }
            }else if (option.equals("2")) {
                System.out.println(" Ingrese el nombre del montacarguista.");
                String nombre= in.next();
                System.out.println(" Ingrese el documento del montacarguista.");
                int documento=in.nextInt();
                for (Integer empleado : empleados) {
                    if(empleado==documento){
                        System.out.println("Ya existe un empleado con este documento");
                        return;
                    }
                }
                empleados.add(documento);
                Montacarguista newMontacarguista=new Montacarguista(nombre,documento,"montacarga");
                //montacarguistas.add(newMontacarguista);
                System.out.println(" Registro Exitoso");
            }else if(option.equals("3")){
                System.out.println(" Ingrese el documento del montacarguista que desea eliminar");
                int docElim= in.nextInt();
                for (Montacarguista montacarguista : montacarguistas) {
                    if(montacarguista.getDocumento()==docElim){
                        montacarguistas.remove(montacarguista);
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
