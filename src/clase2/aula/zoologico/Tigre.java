/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.aula.zoologico;

/**
 *
 * @author PCC-DOMINGO
 */
public class Tigre extends Animal {

    public Tigre(){
        this.setNumeroPatas(4);
        
    }
    
    public Tigre(String nombre){
        this.setNumeroPatas(4);
        this.setNombre(nombre);
        
    }
    
    @Override
    void hacerRuido() {
        System.out.println("Rugir");
    }

    void hacerRuido(boolean molestar) {
        if (molestar) {
            System.out.println("rugir y zarpar");
        }
    }
    
    void hacerRuido(String mensaje){
        System.out.println(mensaje);
    }
    
    void zarpar(){
        System.out.println("ESTOY ZARPANDO");
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Tigre) {
            return ((Tigre) obj).getNombre().equals(this.getNombre());
        }
        return false;
    }
}