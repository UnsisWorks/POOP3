/*************
* Autor: Galicia Cordova Elietzer Jared
* Creado: 14/05/2023
* Modificado: 14/05/2023
* Descripciòn: Implementacion de la clase Ave
*   heredando de Animal
*/
package ejercicioanimales;

import java.util.ArrayList;

/**
 *
 * @author elietzer
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        
        Animal gato1 = new Gato();
        gato1.setNombre("Maik");
        gato1.setNumPta(4);
        gato1.setPeso(1.2);
        
        animales.add(gato1);
        
        animales.add(new Perro("Pulgas", 4, 
                "Domestico", 10.2));
        
        animales.add(new Canario("Piolin", 2, "Jaula", 0.5));
        
        for (Animal animale : animales) {
            System.out.println(animale);
            animale.comer(Gato.comidaGato);
            animale.emitirSonido();
        }
    }
}
