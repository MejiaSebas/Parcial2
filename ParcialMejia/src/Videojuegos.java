
public class Videojuegos implements Entregable {
	public Videojuegos(String titulo, String genero, String compañia, double entregado, int horas) {
		
		this.titulo = titulo;
		this.genero = genero;
		this.compañia = compañia;
		this.horas = horas;
	}
	private String titulo, genero, compañia, entregado;
	private double horas;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCompañia() {
		return compañia;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	public String getEntregado() {
		return entregado;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	@Override
	public String toString() {
		return "Videojuegos [titulo=" + titulo + ", genero=" + genero + ", compañia=" + compañia + ", entregado="
				+ entregado + ", horas=" + horas + "]";
		
	}
	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return false;
	} 

}
