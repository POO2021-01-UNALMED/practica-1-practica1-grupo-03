package gestorAplicacion;

public class VehiculoPesado extends Vehiculo{

    private String tipoRemolque;

    public VehiculoPesado(String placa, String marca, int capacidad, String tipoRemolque) {
        super(placa, marca, capacidad);
        this.tipoRemolque = tipoRemolque;
    }

    public String getTipoRemolque() {
        return tipoRemolque;
    }

    public void setTipoRemolque(String tipoRemolque) {
        this.tipoRemolque = tipoRemolque;
    }
}
