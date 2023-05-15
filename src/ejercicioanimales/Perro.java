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
public class Perro extends Animal {

    public static String comidaPerro= "Alimento";

    public Perro(String nombre, int numPta, String habit, double peso) {
        super(nombre, numPta, habit, peso);
        this.setEspecie("Perro");
    }

    public Perro() {this.setEspecie("Perro");}
    
    
    @Override
    public void comer(String comida) {
        if (comida.equalsIgnoreCase(Perro.comidaPerro)) {
            System.out.println("Gracias");
        } else {
            System.out.println("Solo como alimento para perro");
        }

    }

    @Override
    public void emitirSonido() {
        System.out.println("Guau Guau");
    }

    public void perseguir(Animal animal) {
        if (animal.getEspecie().equals("Gato")) {
            System.out.println("Ven aquiii");
        } else {
            System.out.println("Solo persigo gatos");
        }
    }

    public void pasear() {
        System.out.println("Debo salir a correr");
    }

}
