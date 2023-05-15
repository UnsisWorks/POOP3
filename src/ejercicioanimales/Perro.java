package ejercicioanimales;

/**
 *
 * @author elietzer
 */
public class Perro extends Animal {

    public Perro(String nombre, int numPta, String habit, double peso) {
        super(nombre, numPta, habit, peso);
    }
    
    @Override
    public void comer(String comida) {
        
    }

    @Override
    public void emitirSonido() {
        System.out.println("Guau Guau");
    }
    
    public void perseguir (Animal animal) {
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
