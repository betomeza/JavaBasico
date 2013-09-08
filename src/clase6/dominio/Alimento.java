package clase6.dominio;

import java.util.HashMap;

public class Alimento {
    String unidadMedida;
    String nombre;
    TipoAlimento tipo;
    Double costo;
    Double valorNutricional;
    HashMap<Nutrientes, Double> nutrientes;

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoAlimento getTipo() {
        return tipo;
    }

    public void setTipo(TipoAlimento tipo) {
        this.tipo = tipo;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getValorNutricional() {
        return valorNutricional;
    }

    public void setValorNutricional(Double valorNutricional) {
        this.valorNutricional = valorNutricional;
    }

    public HashMap<Nutrientes, Double> getNutrientes() {
        return nutrientes;
    }

    public void setNutrientes(HashMap<Nutrientes, Double> nutrientes) {
        this.nutrientes = nutrientes;
    }
    
}
