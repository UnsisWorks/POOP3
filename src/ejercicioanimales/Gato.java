package ejercicioanimales;

/**
 *
 * @author elietzer
 */
public class Gato extends Animal {

    public static String comidaGato = "Atun";
    
    public Gato(String nombre, int numPta, String habit, double peso) {
        super(nombre, numPta, habit, peso);
    }

    @Override
    public void comer(String comida) {
        
        if (comida.equalsIgnoreCase(Gato.comidaGato)) {
            System.out.println("Gracias");
        } else {
            System.out.println("Solo como atun fresco");
        }
    }

    @Override
    public void emitirSonido() {
        System.out.println("Miau Miau");
    }
    
    public void ronronear() {
        System.out.println("Brrrr Brrrr");
    }
    
    public void dormir() {
        System.out.println("Zzz Zzz Zzz");
    }
    
}
