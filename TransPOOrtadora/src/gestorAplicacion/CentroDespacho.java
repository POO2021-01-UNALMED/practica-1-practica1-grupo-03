package gestorAplicacion;

import java.io.Serializable;

public class CentroDespacho implements Serializable {

    final  int capacidad;

    public CentroDespacho(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
