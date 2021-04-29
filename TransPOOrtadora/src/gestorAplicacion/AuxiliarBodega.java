package gestorAplicacion;

public class AuxiliarBodega {
	private String nombre;
	private int documento;
	private boolean controlaMontaCarga;
	
	
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
	public boolean isControlaMontaCarga() {
		return controlaMontaCarga;
	}
	public void setControlaMontaCarga(boolean controlaMontaCarga) {
		this.controlaMontaCarga = controlaMontaCarga;
	}
	
}
