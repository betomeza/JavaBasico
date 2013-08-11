package clase2.aula.universo;

public class Universo {
    
    public static void main(String[] args) {

        Humano humano = new Humano();
        humano.alimentarse();
        humano.contaminar();
        
        Hibrido alf2 = new Hibrido();
        alf2.alimentarse();
        alf2.comerGato();
    }
    
}
