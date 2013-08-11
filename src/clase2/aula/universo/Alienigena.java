package clase2.aula.universo;

import clase2.aula.universo.interfaces.SerVivo;

public class Alienigena implements SerVivo{

    @Override
    public void alimentarse() {
        System.out.println("ENERGIA");
    }

    @Override
    public void comunicarse() {
        System.out.println("MENTALMENTE");
    }

    @Override
    public void reproducirse() {
        System.out.println("ASEXUAL");
    }
    
    
}
