/*************
* Autor: Galicia Cordova Elietzer Jared
* Creado: 14/05/2023
* Modificado: 14/05/2023
* Descripciòn: Implementacion de la clase Ave
*   heredando de Animal
*/
package sistemasolar;

/**
 *
 * @author elietzer
 */
public class Planeta {
    
    public static int GASEOSO = 1;
    public static int ENANO = 1;
    public static int TERRESTRE = 1;
    
    private String nombre = null;
    private int numSatelites = 0;
    private double masa = 0;
    private double volumen = 0;
    private int diametro = 0;
    private int disSol = 0;
    private int tipo = 0;

    public Planeta() {
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumSatelites() {
        return numSatelites;
    }

    public void setNumSatelites(int numSatelites) {
        this.numSatelites = numSatelites;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getDisSol() {
        return disSol;
    }

    public void setDisSol(int disSol) {
        this.disSol = disSol;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Planeta{" + "nombre=" + nombre + ", numSatelites=" + 
                numSatelites + ", masa=" + masa + ", volumen=" + volumen + 
                ", diametro=" + diametro + ", disSol=" + disSol + ", tipo=" +
                tipo + '}';
    }
    
    
    
}
