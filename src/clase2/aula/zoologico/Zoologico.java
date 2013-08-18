/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.aula.zoologico;

/**
 *
 * @author PCC-DOMINGO
 */
public class Zoologico {

    public static void main(String[] args) {
        Zoologico.doCasting2();
        Tigre tigreJorge = new Tigre("Jorge");
        Tigre tigreJose = new Tigre("Jorge");
        
        System.out.println(tigreJorge.equals(tigreJose));        
    }

    public static void executeCasting(){
        Gallina gallina = new Gallina();              
        Zoologico.doCasting(gallina);
        //otra forma
        Zoologico.doCasting(new Tigre());        
    }
    
    public static void doCasting2(){
        Animal[] animales = {new Tigre("Tigr"), new Gallina("PEPA"), new Gallina("MAMBA")};
    
        for (Animal animal : animales){
            animal.printNombrePatas();
            if(animal instanceof Tigre){
                ((Tigre) animal).hacerRuido(true);
            }else if(animal instanceof Gallina){
                Gallina gallina = (Gallina) animal;
                gallina.picar();
            }
        
        }
    }
    
    public static void doCasting(Animal animal) {
        if (animal instanceof Tigre) {
            Tigre tigre = (Tigre) animal;
            tigre.hacerRuido(true);
            // otra forma en una linea
            ((Tigre)animal).hacerRuido(true);
            tigre.zarpar();
        } else if (animal instanceof Gallina) {
            animal.hacerRuido();
            Gallina gallina = (Gallina) animal;
            gallina.picar();
        }
    }

    public static void doConstructor() {
        Gallina pepa = new Gallina();
        pepa.setNombre("PEPA");
        pepa.setNumeroPatas(2);
        pepa.printNombrePatas();

        Gallina mamba = new Gallina("MAMBA");
        mamba.printNombrePatas();

        Tigre tigre = new Tigre("FELIX");
        tigre.printNombrePatas();
    }

    public static void doHerencia() {
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
