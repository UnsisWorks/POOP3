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
public abstract class Animal {
    
    private String nombre;
    private int numPta;
    private String habit;
    private String especie;
    private double peso;

    /**
     * @param nombre
     * @param numPta
     * @param habit
     * @param peso 
     */
    public Animal(String nombre, int numPta, String habit, double peso) {
        this.nombre = nombre;
        this.numPta = numPta;
        this.habit = habit;
        this.peso = peso;
    }

    public Animal() {}
    
    // Methos generals for animals
    public abstract void comer(String comida);
    public abstract void emitirSonido();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPta() {
        return numPta;
    }

    public void setNumPta(int numPta) {
        this.numPta = numPta;
    }

    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        this.habit = habit;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", numPta=" + numPta + 
                ", habit=" + habit + ", especie=" + especie + ", peso=" + peso + '}';
    }
    
}
