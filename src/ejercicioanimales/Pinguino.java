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
public class Pinguino extends Animal {

    public static String comidaPinguino = "pescado";
    /**
     * @param nombre
     * @param numPta
     * @param habit
     * @param peso 
     */
    public Pinguino(String nombre, int numPta, String habit, double peso) {
        super(nombre, numPta, habit, peso);
        this.setEspecie("Pinguino");
    }

    public Pinguino() {this.setEspecie("");}

    
    @Override
    public void comer(String comida) {
        if (comida.equalsIgnoreCase(Pinguino.comidaPinguino)) {
            System.out.println("Gracias");
        } else {
            System.out.println("Solo como pescado fresco");
        }
    }

    @Override
    public void emitirSonido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
