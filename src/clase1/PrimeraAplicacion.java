package clase1;

public class PrimeraAplicacion {

    public static void main(String[] args) {
        PrimeraAplicacion.ejercicio8(1);
    }

    public static void ejercicio1() {
        //int dia-semana
        //int Código.postal;
        //String interface;
        String Nombre;
        String Último;
        int año;
        String Nombre_Empleado;
        //int 2000Año;
        //String 1empleado;
        int año2000;
        //int new;
        //String nombre.empleado;
    }

    public static void ejercicio3() {
        int edad = 19;
        int talla = 20;

        if (edad == talla) {
            System.out.println("Los valores son identicos");
        } else {
            System.out.println("Los valores son diferentes");
        }
    }

    public static void ejercicio4() {
        int numeroX = 5;
        int numeroY = 2;
        int numeroTemporal = numeroX;
        numeroX = numeroY;
        numeroY = numeroTemporal;

        System.out.println("X = " + numeroX);
        System.out.println("Y = " + numeroY);
    }

    public static void ejercicio5() {
        int x = 5;
        int y = 8;
        int z = 6;
        int solucion = x + y - 3 * z;
        System.out.println("Solucion = " + solucion);
    }

    public static void ejercicio6() {
        int res = 7 * (15 + 1) * 2 % 2;
        boolean res1 = 0.0 / 0.0 == 0.0 / 0.0;
        boolean res2 = (!true && false);
        boolean res3 = ((3 * 4 >= 12) && (3.5 > 1 + 2f)) || (4 < 8);
        boolean res4 = !(true == false);
        boolean res5 = (!true == false);
        System.out.println("Resultado = " + res5);
    }

    public static void ejercicio7(int edad) {
        int porcentaje = 0;

        if (edad < 18) {
            porcentaje = 15;
        } else if (edad >= 60) {
            porcentaje = 30;
        } else {
            porcentaje = 0;
        }
        System.out.println("Descuento de " + porcentaje + "%");
    }

    public static void ejercicioWhile() {

        int contador = 0;

        while (contador < 10) {

            System.out.println(contador);
            ++contador;
            if (contador == 6) {
                ++contador;
                continue;
            }
        }
    }

    public static void ejercicioDoWhile() {
        int contador = 0;

        inicio:
        do {
            System.out.println(contador);
            ++contador;
            if (contador == 6) {
                break inicio;
            }
        } while (contador < 10);
    }

    public static void ejercicioSwitch() {
        int diaSemana = 6;
        String textoSemana = "";

        switch (diaSemana) {
            case 1:
                textoSemana = "Domingo";
                break;
            case 6:
                textoSemana = "Viernes";
                break;
            default:
                textoSemana = "Lunes";
                break;
        }


    }

    public static void ejercicio8(int mes) {
        int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(mes<meses.length+1){
            System.out.println("Numero de Días: " + meses[mes-1]);
        }
    }

    public static void ejercicioMatriz() {
        int[] matrizNumeros = new int[5];
        matrizNumeros[0] = 648;
        matrizNumeros[1] = 342;
        matrizNumeros[2] = 3424;
        matrizNumeros[3] = 642;
        
        for(int i=0; i<matrizNumeros.length; i++){
            System.out.println(matrizNumeros[i]);
        }
        
        int[][] matrizBiDimensional = new int[5][2];
        matrizBiDimensional[0][0] = 648;
        matrizBiDimensional[0][1] = 342;
        
        matrizBiDimensional[1][0] = 12345;
        matrizBiDimensional[1][1] = 3422;
        
        matrizBiDimensional[2][0] = 64834;
        matrizBiDimensional[2][1] = 34223;
        
        matrizBiDimensional[3][0] = 23648;
        matrizBiDimensional[3][1] = 12342;

        matrizBiDimensional[4][0] = 12648;
        matrizBiDimensional[4][1] = 1232;

        for(int i=0; i<matrizBiDimensional.length; i++){
            for(int j=0; j<matrizBiDimensional[i].length; j++){
                System.out.println(matrizBiDimensional[i][j]);
            }
        
        }
        
    }
    
}
