/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.ito.poo;
import java.time.LocalDate;
public class Instrumento {

	public Instrumento(String nombre, String tipo, int yearsAntiguo, String musico, LocalDate fechaUtilidad) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.yearsAntiguo = yearsAntiguo;
		this.musico = musico;
		this.fechaUtilidad = fechaUtilidad;
	}
	private String nombre = "";
	private String tipo = "";
	private int yearsAntiguo = 0;
	private String musico = "";
	private LocalDate fechaUtilidad = null;
	public Instrumento() {
		super();
	}
	public void agregarMusico(String musico) {
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String newTipo) {
		this.tipo = newTipo;
	}
	public int getYearsAntiguo() {
		return this.yearsAntiguo;
	}
	public void setYearsAntiguo(int newYearsAntiguo) {
		this.yearsAntiguo = newYearsAntiguo;
	}
	public String getMusico() {
		return this.musico;
	}
	public void setMusico(String newMusico) {
		this.musico = newMusico;
	}
	public java.time.LocalDate getFechaUtilidad() {
		return this.fechaUtilidad;
	}
	public void setFechaUtilidad(java.time.LocalDate newFechaUtilidad) {
		this.fechaUtilidad = newFechaUtilidad;
	}
	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", tipo=" + tipo + ", yearsAntiguo=" + yearsAntiguo + ", musico="
				+ musico + ", fechaUtilidad=" + fechaUtilidad + "]";
	}
}
