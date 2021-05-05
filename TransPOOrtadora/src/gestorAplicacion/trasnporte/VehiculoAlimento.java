package gestorAplicacion.trasnporte;


public class VehiculoAlimento extends Vehiculo{

    private boolean refrigerado;
    private double  temperatura;

    public VehiculoAlimento(String placa, String marca, int capacidad, boolean refrigerado, double temperatura) {
        super(placa, marca, capacidad);
        this.refrigerado = refrigerado;
        this.temperatura = temperatura;
    }

    public VehiculoAlimento(String placa, String marca, int capacidad) {
        super(placa, marca, capacidad);
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
}
