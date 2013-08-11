
package clase2.aula.figuras;

public class Modelamiento {
    
    public static void main(String[] args) {
        
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setAlto(10d);
        cuadrado.setAncho(10d);
        
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAlto(10d);
        rectangulo.setAncho(20d);
        
        System.out.println(cuadrado.getArea());
        System.out.println(rectangulo.getArea());
        
    }
    
    
    
}
