/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.aula.universo;

import clase2.aula.universo.interfaces.MelmakianoInterface;

/**
 *
 * @author PCC-DOMINGO
 */
public class Hibrido extends Humano implements MelmakianoInterface{

    @Override
    public void comerGato() {
        System.out.println("COMIENDO GATOS");
    }
}
