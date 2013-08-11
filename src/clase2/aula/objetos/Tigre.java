/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.aula.objetos;

/**
 *
 * @author PCC-DOMINGO
 */
public class Tigre extends Animal {

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
}