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
public class Ave extends Animal {

    public static String comidaAve = "alpiste";
    /**
     * @param nombre
     * @param numPta
     * @param habit
     * @param peso 
     */
    public Ave(String nombre, int numPta, String habit, double peso) {
        super(nombre, numPta, habit, peso);
    }

    @Override
    public void comer(String comida) {
        
        if (comida.equalsIgnoreCase(Ave.comidaAve)) {
            System.out.println("Gracias");
        } else {
            System.out.println("Solo como alpiste");
        }
    }

    @Override
    public void emitirSonido() {
        System.out.println("RUU RUU");
    }
    
}
