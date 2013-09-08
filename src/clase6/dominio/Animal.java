package clase6.dominio;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Animal {

    private Integer codigo;
    private String nombre;
    private double peso;    
    private Date fechaNacimiento;
    private Especie especie;
    HashMap<Dieta, Integer> dietas;    
    private String observaciones;    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public HashMap<Dieta, Integer> getDietas() {
        return dietas;
    }

    public void setDietas(HashMap<Dieta, Integer> dietas) {
        this.dietas = dietas;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    
}
