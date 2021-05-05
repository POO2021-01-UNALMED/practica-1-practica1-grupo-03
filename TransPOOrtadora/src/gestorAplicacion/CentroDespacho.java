package gestorAplicacion;

import gestorAplicacion.trasnporte.Vehiculo;

import java.util.ArrayList;

public class CentroDespacho {

    static ArrayList<Vehiculo> Vehiculos = new ArrayList<>();
    final  int capacidad;


    public CentroDespacho(int capacidad) {
        this.capacidad = capacidad;
    }

    public static ArrayList<Vehiculo> getVehiculos() {
        return Vehiculos;
    }

    public static void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        Vehiculos = vehiculos;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
