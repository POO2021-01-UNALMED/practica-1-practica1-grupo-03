package gestorAplicacion.empleado;

public abstract class Empleado  {

    private String nombre;
    private int documento;


    abstract void Salario ();




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }
}
