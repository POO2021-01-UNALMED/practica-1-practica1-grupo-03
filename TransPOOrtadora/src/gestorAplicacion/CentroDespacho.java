package gestorAplicacion;

import gestorAplicacion.trasnporte.Vehiculo;
import gestorAplicacion.trasnporte.VehiculoAlimento;
import gestorAplicacion.trasnporte.VehiculoLiviano;
import gestorAplicacion.trasnporte.VehiculoPesado;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import static gestorAplicacion.Carga.cargas;
import static gestorAplicacion.trasnporte.VehiculoAlimento.vehiculosAlimentos;
import static gestorAplicacion.trasnporte.VehiculoLiviano.vehiculosLivianos;
import static gestorAplicacion.trasnporte.VehiculoPesado.vehiculosPesados;

public class CentroDespacho implements Serializable {

    final  int capacidad;
    public ArrayList<Carga> carga;
    public ArrayList<Vehiculo> vehiculo;

    public CentroDespacho(int capacidad) {
        this.capacidad = capacidad;
        carga=new ArrayList<>();
        vehiculo=new ArrayList<>();
    }


    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Se despacha al vehiculo: " + vehiculo +
                " con la carga " + carga +
                '}';
    }


    public static void despachoVehiculo() {
        Scanner in=new Scanner(System.in);
        System.out.println(" Ingrese la referencia de la carga que va a despachar.");
        int referencia=in.nextInt();
        Carga newCarga = null;
        for (Carga carga : cargas) {
            if(carga.getReferencia()==referencia){
                newCarga=carga;
                System.out.println("carga encontrada");
                break;
            }
        }
        System.out.println(newCarga);
        assert newCarga != null;
        if(newCarga.getTipo().equals("Liviano")){
            System.out.println(" como su carga es de tipo liviano, puede escoger cualquiera");
            System.out.println(" de estos vehiculos ");
            System.out.println();
            for (VehiculoLiviano vehiculoLiviano : vehiculosLivianos) {
                System.out.println(vehiculoLiviano);
            }
            System.out.println(" Ingrese la placa del vehiculo que desea escoger.");
            String placa=in.next();
            for (VehiculoLiviano vehiculoLiviano : vehiculosLivianos) {
                if(vehiculoLiviano.getPlaca().equals(placa)){
                    System.out.println(" vehiculo encontrado con exito");
                    CentroDespacho despacho=new CentroDespacho(100);
                    despacho.vehiculo.add(vehiculoLiviano);
                    despacho.carga.add(newCarga);
                    System.out.println(despacho);
                }
            }
        }else if(newCarga.getTipo().equals("Alimento")){
            System.out.println(" como su carga es de tipo alimento, puede escoger cualquiera");
            System.out.println(" de estos vehiculos ");
            System.out.println();
            for (VehiculoAlimento vehiculoAlimento : vehiculosAlimentos) {
                System.out.println(vehiculoAlimento);
            }
            System.out.println(" Ingrese la placa del vehiculo que desea escoger.");
            String placa=in.next();
            for (VehiculoAlimento vehiculoAlimento : vehiculosAlimentos) {
                if(vehiculoAlimento.getPlaca().equals(placa)){
                    System.out.println(" vehiculo encontrado con exito");
                    CentroDespacho despacho=new CentroDespacho(100);
                    despacho.vehiculo.add(vehiculoAlimento);
                    despacho.carga.add(newCarga);
                    System.out.println(despacho);
                }
            }
        }else if(newCarga.getTipo().equals("Pesado")){
            System.out.println(" como su carga es de tipo pesada, puede escoger cualquiera");
            System.out.println(" de estos vehiculos ");
            System.out.println();
            for (VehiculoPesado vehiculoPesado : vehiculosPesados) {
                System.out.println(vehiculoPesado);
            }
            System.out.println(" Ingrese la placa del vehiculo que desea escoger.");
            String placa=in.next();
            for (VehiculoPesado vehiculoPesado : vehiculosPesados) {
                if(vehiculoPesado.getPlaca().equals(placa)){
                    System.out.println(" vehiculo encontrado con exito");
                    CentroDespacho despacho=new CentroDespacho(100);
                    despacho.vehiculo.add(vehiculoPesado);
                    despacho.carga.add(newCarga);
                    System.out.println(despacho);
                }
            }
        }else{
            System.out.println(" Error en el sistema");
        }

    }
}
