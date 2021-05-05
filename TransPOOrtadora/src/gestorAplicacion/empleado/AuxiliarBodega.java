package gestorAplicacion.empleado;

public class AuxiliarBodega extends Empleado {


	public String rol;    // recepción, almacenamiento y preparación para la distribución de productos,

	public AuxiliarBodega(String nombre, int documento, String rol) {
		super(nombre, documento);
		this.rol = rol;
	}

	void Salario() {
		System.out.println("Calcular salario");
	}



}
