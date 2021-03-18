//Oliver De la Cruz Bautista
package app.ito.poo;
import java.time.LocalDate;
import clases.ito.poo.Instrumento;

public class MyApp {
     static void run() {
    	 System.out.println(new Instrumento("Guitarra","Cuerdas",100,"Gallo Elizalde",LocalDate.of(2021, 03, 17)));
     }
	public static void main(String[] args) {
	run();
	
 }
}
