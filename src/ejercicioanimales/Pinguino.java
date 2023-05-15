package ejercicioanimales;

/**
 *
 * @author elietzer
 */
public class Pinguino extends Animal {

    /**
     * @param nombre
     * @param numPta
     * @param habit
     * @param peso 
     */
    public Pinguino(String nombre, int numPta, String habit, double peso) {
        super(nombre, numPta, habit, peso);
    }

    @Override
    public void comer(String comida) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void emitirSonido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
