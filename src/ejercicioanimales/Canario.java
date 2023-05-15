/*************
* Autor: Galicia Cordova Elietzer Jared
* Creado: 14/05/2023
* Modificado: 14/05/2023
* Descripciòn: Implementacion de la clase Ave
*   heredando de Animal
*/
package ejercicioanimales;

/**
 *
 * @author elietzer
 */
public class Canario extends Animal {

    
    public static String comidaCanario = "Semillas";
    /**
     * @param nombre
     * @param numPta
     * @param habit
     * @param peso 
     */
    public Canario(String nombre, int numPta, String habit, double peso) {
        super(nombre, numPta, habit, peso);
        this.setEspecie("Canario");
    }

    public Canario() { this.setEspecie("Canario");}
    
    

    @Override
    public void comer(String comida) {
    
        if (comida.equalsIgnoreCase(Canario.comidaCanario)) {
            System.out.println("Gracias");
        } else {
            System.out.println("Solo como semillas de girasol");
        }
    }

    @Override
    public void emitirSonido() {
        System.out.println("Pio Pio");
    }
    
    public void volar() {
        System.out.println("Vuela Vuela");
    }
    
    public void cantar () {
        System.out.println("ruu ruuu ruu ruu ruu");
    }
    
}












