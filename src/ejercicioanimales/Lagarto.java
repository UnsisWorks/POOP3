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
public class Lagarto extends Animal {

    public static String comidaLagarto = "ave";

    /**
     * @param nombre nombre del animal
     * @param numPta nnumero de patas del animal
     * @param habit habitad natural del animal
     * @param peso peso en kg del animal
     */
    public Lagarto(String nombre, int numPta, String habit, double peso) {
        super(nombre, numPta, habit, peso);
        this.setEspecie("Lagarto");
    }

    public Lagarto() {this.setEspecie("Lagarto");}

    
    @Override
    public void comer(String comida) {
      
        if (comida.equalsIgnoreCase(Lagarto.comidaLagarto)) {
            System.out.println("Gracias");
        } else {
            System.out.println("Solo como aves pqueñas");
        }
    }

    @Override
    public void emitirSonido() {
        
    }
    
}
