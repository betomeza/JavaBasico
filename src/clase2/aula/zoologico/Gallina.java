/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.aula.zoologico;

/**
 *
 * @author PCC-DOMINGO
 */
public class Gallina extends Animal{
    
    String pico;

    public Gallina(){
        this.setNumeroPatas(2);
        }
    
    public Gallina(String nombre){
        this.setNombre(nombre);
        this.setNumeroPatas(2);
    }
    
    @Override
    void hacerRuido(){
        System.out.println("coc coc");
    }
    
    void picar(){
        System.out.println("ESTOY PICANDO");
    }
}
