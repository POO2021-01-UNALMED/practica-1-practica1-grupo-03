package gestorAplicacion.trasnporte;

public class VehiculoLiviano extends Vehiculo{

    private String tipoVehiculo;

    public VehiculoLiviano(String placa, String marca, int capacidad, String tipoVehiculo) {
        super(placa, marca, capacidad);
        this.tipoVehiculo = tipoVehiculo;
    }


    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }




}
