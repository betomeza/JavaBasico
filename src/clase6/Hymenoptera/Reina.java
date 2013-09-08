/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6.Hymenoptera;

/**
 *
 * @author PCC-DOMINGO
 */
public class Reina extends Eusocial implements TrabajoEusocial{
    
    public Reina() {
        this.setCicloDesarrollo(16);
        this.setSexo("f");
    }
    
    
    @Override
    public void trabajo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
