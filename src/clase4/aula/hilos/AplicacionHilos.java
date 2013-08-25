package clase4.aula.hilos;

public class AplicacionHilos {

    public static void main(String[] args) {
        AplicacionHilos.doHiloImplements();
    }

    public static void doHiloHerencia() {
        HiloHerencia h1 = new HiloHerencia();
        h1.start();
    }

    public static void doHiloImplements() {
        HiloImplements hilo = new HiloImplements();
        Thread th = new Thread(hilo);
        th.start();

    }
}
