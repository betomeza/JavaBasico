package clase3.aula;

import java.util.Date;

public class ClaseObject {

    public static void main(String[] args) {
        ClaseObject object = new ClaseObject();
        ClaseObject.doToString();
        System.out.println(object.toString());
    }

    public static void doEquals() {
        Date fechaNacimiento = new Date();
        //Date fechaCumpleaños = fechaNacimiento;
        Date fechaCumpleaños = new Date();

        if (fechaNacimiento == fechaCumpleaños) {
            System.out.println("Son iguales");
        }
        //Compara contenido
        if (fechaNacimiento.equals(fechaCumpleaños)) {
            System.out.println("Iguales");
        }
        
    }

    public static void doToString(){
        Date fechaNacimiento = new Date();
        System.out.println(fechaNacimiento.toString());
                
    }
    
    
    public static void overrideToString(){
        ClaseObject myObject = new ClaseObject();
        System.out.println(myObject.toString());
    }
    
    public static void rareCompare(){
        Integer numeroA = 12;
        Integer numeroB = 12;
        
        Integer numeroX = new Integer(12);
        Integer numeroY = new Integer(12);

        if(numeroA==numeroB){
            System.out.println("iguales");
        }
        
        if(numeroX == numeroY){
            System.out.println("iguales X e Y");
        }
    }  
    
}


