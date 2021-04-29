package gestorAplicacion;

public class Carga {
	private String tipo;
	private int peso;
	private int volumen;
	
	public Carga(String tipo,int peso,int volumen) {
		this.tipo=tipo;
		this.peso=peso;
		this.volumen=volumen;
	}
		
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
}
