package clase3.aula.usoInterface;

public class usoInterface {

    public static void main(String[] args) {

        Capitalizable[] listado = new Capitalizable[3];

        listado[0] = new Palabra("Programacion en Java");
        listado[1] = new Palabra("Tecsup");
        listado[2] = new Oracion("Curso Java Basico - Tecsup");

        /*
        for (int i = 0; i < listado.length; i++) {
            System.out.println("Texto " + i + ": " + listado[i].cambiaMayuscula());
        }
        */
        for (Capitalizable item : listado) {
            System.out.println(item.cambiaMayuscula());
        }
    }
}
