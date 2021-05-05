package gestorAplicacion.empleado;

public class Conductor extends Empleado {



    String  TipoVehiculo;

    public Conductor(String nombre, int documento, String tipoVehiculo) {
        super(nombre, documento);
        TipoVehiculo = tipoVehiculo;
    }



    @Override
    void Salario() {
        System.out.println("Calcular salario");
    }
}
