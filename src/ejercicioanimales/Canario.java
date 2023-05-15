package ejercicioanimales;

/**
 *
 * @author elietzer
 */
public class Canario extends Animal {

    /**
     * @param nombre
     * @param numPta
     * @param habit
     * @param peso 
     */
    public Canario(String nombre, int numPta, String habit, double peso) {
        super(nombre, numPta, habit, peso);
    }

    @Override
    public void comer(String comida) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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












