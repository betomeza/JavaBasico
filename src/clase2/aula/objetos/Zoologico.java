/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.aula.objetos;

/**
 *
 * @author PCC-DOMINGO
 */
public class Zoologico {
    
    public static void main(String[] args) {
        
        Zoologico.doHerencia();
    }
    
    public static void doHerencia(){
        Tigre tiger = new Tigre();
        tiger.setNumeroPatas(4);
        tiger.hacerRuido();
        System.out.println(tiger.getNumeroPatas());
        
        tiger.hacerRuido(true);
        
        tiger.hacerRuido("Hola");
        
        Gallina pepa = new Gallina();
        pepa.setNumeroPatas(2);
        System.out.println(pepa.getNumeroPatas());
        pepa.hacerRuido();
    }
    
    public static void instanciaObjeto() {

        Animal tigre = new Animal();
        tigre.setNombre("Tigrrrr");
        
        System.out.println(tigre.getNombre());
        tigre.hacerRuido();
      

    }
}
