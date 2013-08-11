package clase2.aula.universo;

import clase2.aula.universo.interfaces.HumanoInterface;
import clase2.aula.universo.interfaces.SerVivo;

public class Humano implements SerVivo, HumanoInterface{

    @Override
    public void alimentarse() {
        System.out.println("COMER");
    }

    @Override
    public void comunicarse() {
        System.out.println("HABLAR");
    }

    @Override
    public void reproducirse() {
        System.out.println("SEXUAL");
    }

    @Override
    public void contaminar() {
        System.out.println("BOTAR DESHECHOS");
    }

    
}
