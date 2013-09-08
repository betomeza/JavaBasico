/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6.Hymenoptera;

/**
 *
 * @author PCC-DOMINGO
 */
public class Obrera extends Eusocial implements TrabajoEusocial{

    public Obrera() {
        this.setCicloDesarrollo(21);
        this.setSexo("f");
    }
    
    
    @Override
    public void trabajo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
