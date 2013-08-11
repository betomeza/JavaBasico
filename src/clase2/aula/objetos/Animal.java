/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.aula.objetos;

/**
 *
 * @author PCC-DOMINGO
 */
public class Animal {
    
    private int numeroPatas;   
    private String especie;
    private int tamaño;
    private String nombre;
    
    void hacerRuido(){
        System.out.println("ZZZZZZZZZZZZZZ");
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
