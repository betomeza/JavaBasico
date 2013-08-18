package clase3.aula;


public class Matematicas {

    public static void main(String[] args) {
        System.out.println(Matematicas.doOperaciones());
    }
    
    public static void getConstants(){
        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
    
    public static double doOperaciones(){
        return Math.min(-11, 44);    
    }
}
