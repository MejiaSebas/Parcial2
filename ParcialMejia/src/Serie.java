
public class Serie implements Entregable {
public Serie(String titulo, String creador, String genero, int temporadas, double entregado) {
		
		this.titulo = titulo;
		this.creador = creador;
		this.genero = genero;
		this.temporadas = temporadas;
		
	}


private String titulo, creador, genero;
private int temporadas;

public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getCreador() {
	return creador;
}
public void setCreador(String creador) { 
	this.creador = creador;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public int getTemporadas() {
	return temporadas;
}
public void setTemporadas(int temporadas) {
	this.temporadas = temporadas;
}



@Override
public String toString() {
	return "Serie [titulo=" + titulo + ", creador=" + creador + ", genero=" + genero + ", temporadas=" + temporadas
			+ "]";
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
