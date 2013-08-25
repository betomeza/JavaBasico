package clase4.aula.colecciones;

import clase2.aula.zoologico.Animal;
import clase2.aula.zoologico.Gallina;
import clase2.aula.zoologico.Tigre;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Aplicacion {

    public static void main(String[] args) {
        Aplicacion.listaAnimales();
    }

    public static void ejemploArrayList() {
        Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
        Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
        Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);

        // ArrayList
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(e1);
        listaEstudiantes.add(e2);
        listaEstudiantes.add(e3);

        Collections.sort(listaEstudiantes);

        for (Estudiante e : listaEstudiantes) {
            System.out.println(e.getNombres() + " " + e.getApellidos());
        }
    }

    public static void ejemploLinkedList() {
        Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
        Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
        Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
        LinkedList<Estudiante> listadoEstudiantes = new LinkedList<Estudiante>();

        // ArrayList
        listadoEstudiantes.addFirst(e1);

        listadoEstudiantes.addFirst(e2);

        listadoEstudiantes.addLast(e3);

        for (Estudiante estudiante : listadoEstudiantes) {
            System.out.println(estudiante.getNombres());
        }
        System.out.println(listadoEstudiantes.size());
    }

    public static void ejemploHashset() {

        Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
        Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
        Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
        Estudiante e4 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);

        // HashSet
        HashSet<Estudiante> setEstudiante = new HashSet<>();
        setEstudiante.add(e1);
        setEstudiante.add(e2);
        setEstudiante.add(e3);
        setEstudiante.add(e1);
        setEstudiante.add(e4);

        for (Estudiante e : setEstudiante) {
            System.out.println(e.getNombres() + " " + e.getApellidos());
        }

    }

    public static void ejemploHashMap() {
        Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
        Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
        Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);

        // HashMap
        HashMap<Integer, Estudiante> mapEstudiantes = new HashMap<>();
        mapEstudiantes.put(100525, e1);
        mapEstudiantes.put(100526, e2);
        mapEstudiantes.put(100527, e3);
        mapEstudiantes.put(100527, e3);


        Estudiante e = mapEstudiantes.get(100526);
        System.out.println(e.getNombres());

        Collection<Estudiante> co = mapEstudiantes.values();
        for (Estudiante es : co) {
            System.out.println(es.getNombres());
        }
    }
    
    public static void listaAnimales(){
        Tigre tigreJorge = new Tigre("Jorge");
        Tigre tigrePaco = new Tigre("Paco");
        Gallina gallinaMamba = new Gallina("Mamba");
        
        //List<Animal> listaAnimales = new ArrayList<>();
        Set<Animal> listaAnimales = new HashSet<>();
        listaAnimales.add(tigreJorge);
        listaAnimales.add(tigrePaco);
        listaAnimales.add(gallinaMamba);
        
        for(Animal a : listaAnimales){
            System.out.println(a.getNombre() +  " " + a.getNumeroPatas());
        }
    }   
}